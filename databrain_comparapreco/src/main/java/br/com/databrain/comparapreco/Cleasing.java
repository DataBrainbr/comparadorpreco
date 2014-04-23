/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;
import br.com.databrain.util.cleasing.CleasingUtil;

/**
 *
 * @author Paulo
 */
public class Cleasing {
    
    /**
     * Tratar informações capturadas dos sites
     * @param pTexto
     * @return 
     * @author Paulo Henrique
     */
    public String tratarDescricaoProduto(String pTexto){
        CleasingUtil tratar = new CleasingUtil();
        
        pTexto = pTexto.trim();
        pTexto = tratar.tirarEspacoDuplo(pTexto);
        pTexto = tratar.trocarCaracterEspecial(pTexto);
        pTexto = tratar.trocarTagsHtml(pTexto);
        
        return pTexto;
    }
    
}
