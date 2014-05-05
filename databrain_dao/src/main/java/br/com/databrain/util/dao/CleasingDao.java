/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.util.dao;

import java.util.List;
import java.sql.ResultSet;
import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.entities.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo
 */
public class CleasingDao {
    
    /**
     * 
     * @return
     * @author Paulo Henrique
     */
    public List<CleasingCaracterEspecial> retornaListaCaracterEspecial(){
        ConexaoMySql cn = new ConexaoMySql();
        
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT cleasing_caracter_especial, cleasing_caracter_correto "
                + "FROM db_sistema.cleasing_caracter_especial;");
        
        List<CleasingCaracterEspecial> retorno = new ArrayList<CleasingCaracterEspecial>();
        
        try{
            
            ResultSet rs = cn.retornarResultSet(sb.toString());

            while(rs.next()){
                CleasingCaracterEspecial cce = new CleasingCaracterEspecial();
                
                cce.setCaracterDe(rs.getString("cleasing_caracter_especial"));
                cce.setCaracterPara(rs.getString("cleasing_caracter_correto"));
                
                retorno.add(cce);
            }
             
            return retorno;
        }
        
        catch(SQLException ex){
            
            return retorno;
        } 
        
        catch (Exception ex) {
            Logger.getLogger(CleasingDao.class.getName()).log(Level.SEVERE, null, ex);
            return retorno;
        }       
    }
    
    /**
     * 
     * @return 
     * @author Paulo Henrique
     */
    public List<CleasingTagsHtml> retornaListaTagsHtml(){
        ConexaoMySql cn = new ConexaoMySql();
        
        StringBuilder sb = new StringBuilder();
        sb.append("select cleasing_tags_html from cleasing_tags_html;");
        
        List<CleasingTagsHtml> retorno = new ArrayList<CleasingTagsHtml>();
        
        try{
            
            ResultSet rs = cn.retornarResultSet(sb.toString());

            while(rs.next()){
                CleasingTagsHtml cce = new CleasingTagsHtml();
                
                cce.setCaracterDe(rs.getString("cleasing_tags_html"));
                cce.setCaracterPara(" ");
                
                retorno.add(cce);
            }
             
            return retorno;
        }
        
        catch(SQLException ex){
            
            return retorno;
        } 
        
        catch (Exception ex) {
            Logger.getLogger(CleasingDao.class.getName()).log(Level.SEVERE, null, ex);
            return retorno;
        }       
    }
    
}
