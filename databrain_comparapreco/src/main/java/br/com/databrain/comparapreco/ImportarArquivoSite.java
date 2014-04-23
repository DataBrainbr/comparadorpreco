/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;

import java.util.List;  
import java.util.Arrays;
import br.com.databrain.util.ArquivoTexto;
import br.com.databrain.entities.*;
import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.comparapreco.dao.ComparaprecoDao;
import java.sql.SQLException;


/**
 *
 * @author Paulo
 */
public class ImportarArquivoSite {
    /**
     * 
     * @param pArquivo
     * @throws Exception 
     */
    public void importarArquivoSite(String pArquivo) throws Exception
    {
        
        ComparaprecoDao bco = new ComparaprecoDao();
        List<String> dados = Arrays.asList();
        ArquivoTexto pr = new ArquivoTexto();
        Produto produto = new Produto();
        String[] array;      
        
        try
        {
            dados = pr.lerArquivo(pArquivo);
            
            for (String e : dados)  {
                
                array = e.split("\\|");
                
                produto.setId(1);
                produto.setNomeProduto(array[0].toString());
                produto.setPrecoProduto(array[1].toString());
                produto.setFotoProduto(array[2].toString());
                produto.setDescricaoProduto(array[3].toString());
                
                 bco.inserirLinkBanco(produto);
            }
        }
        
        catch(Exception ex){
            
          
        }
       
    }
}