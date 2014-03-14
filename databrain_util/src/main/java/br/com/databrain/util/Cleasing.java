/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.util;

/**
 *
 * @author Paulo
 */
public class Cleasing {
    
    /**
     * 
     * @param pTexto
     * @return 
     */
    public String tirarEspacoDuplo(String pTexto){
        
        pTexto = pTexto.trim();
        
        while(pTexto.contains("  ")){
        
            pTexto = pTexto.replace("  ", " ");
        }
        
        return pTexto;
    }
            
    
}
