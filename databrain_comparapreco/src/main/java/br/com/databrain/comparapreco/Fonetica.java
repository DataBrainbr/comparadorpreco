/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;

import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.util.DoubleMetaPhone;
import br.com.databrain.comparapreco.cleasing.CleasingTratamentoTexto;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List; 

/**
 *
 * @author Paulo
 */
public class Fonetica {
    
    /**
     * Método para fonetizar o texto
     * @param pTexto
     * @return 
     */
    public String Fonetizar(String pTexto)
    {
        pTexto = pTexto.trim();
        String[] dados;
        StringBuilder retorno = new StringBuilder();
        DoubleMetaPhone dmp = new DoubleMetaPhone();
        CleasingTratamentoTexto cs = new CleasingTratamentoTexto();
        pTexto = cs.tirarEspacoDuplo(pTexto);
        
        if (pTexto.contains(" ")){
            dados = pTexto.split(" ");
            
            for (int i = 0; i < dados.length ; ++i) {  
                //verificar se texto é pronome
                if(IsPronome(dados[i].toString())==false){
                    retorno.append(dmp.doubleMetaphone(dados[i].toString())); 
                }
            }
            
        }else{
            retorno.append(dmp.doubleMetaphone(pTexto)); 
        }
        
        return retorno.toString();
        
    }
    
    /**
     * Verificar se o texto é pronome
     * @param pTexto
     * @return 
     */
    protected Boolean IsPronome(String pTexto)
    {
        ConexaoMySql cn = new ConexaoMySql();
        
        Boolean retorno=false;
        String strSQL = "select cleasing_pronome from cleasing_pronome";
        
        try{
            
            ResultSet rs = cn.retornarResultSet(strSQL);
         
            while(rs.next()){
                if(pTexto.equals(rs.getString("cleasing_pronome"))){
                    retorno=true;
                }
                if(retorno){
                    break;
                }
            }
            
            return retorno;
        }
        
        catch(Exception ex){
            return retorno;
        }
        
        
        
    }
            
}
