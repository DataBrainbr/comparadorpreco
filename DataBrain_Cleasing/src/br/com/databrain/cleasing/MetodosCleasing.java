/*
 * Métodos de limpeza dos dados capturados
 */
package br.com.databrain.cleasing;

import java.sql.*;
import br.com.databrain.comparapreco.entities.*;

/**
 *
 * @author Paulo
 */
public class MetodosCleasing {
    
    /**
     * 
     * @param p_Texto
     * @return Texto sem espaços duplos
     */
     public String retiraEspacoDuplo(String p_Texto){
         
        while (p_Texto.contains("  "))
          {
              p_Texto = p_Texto.replace("  ", " ");  
          }

          p_Texto = p_Texto.trim() ;

          return p_Texto;
         
     }
     
    public String retiraTagsHTML(String p_Texto)
    {
        CleasingDAO cd = new CleasingDAO();
        ResultSet tagsRs;
        
        try
        {
            tagsRs = cd.retiraTagsHTMLDAO();

            while (tagsRs.next())
            {
                if(p_Texto.contains(tagsRs.getString("cleasing_tags_html")))
                {
                    p_Texto = p_Texto.replace(tagsRs.getString("cleasing_tags_html"), " ");
                }
            }
            
            return p_Texto;
        }
        
        catch (Exception e)
        {
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
          return "";
        }
        

    }
}
