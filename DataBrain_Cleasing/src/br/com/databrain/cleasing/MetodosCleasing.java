/*
 * Métodos de limpeza dos dados capturados
 */
package br.com.databrain.cleasing;

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
     
    
}
