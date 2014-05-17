/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco.cleasing;

import br.com.databrain.persistence.model.*;
import br.com.databrain.persistence.dao.*;
import java.util.ArrayList;
import java.util.*;


/**
 *
 * @author Paulo
 */
public class CleasingTratamentoTexto {
    
    /**
     * Retirar espaços duplos do conteúdo do texto
     * @param pTexto
     * @return 
     * @author Paulo Henrique
     */
    public String tirarEspacoDuplo(String pTexto){
        
        pTexto = pTexto.trim();
        
        while(pTexto.contains("  ")){
        
            pTexto = pTexto.replace("  ", " ");
        }
        
        return pTexto;
    }
    
    /**
     * Retirar aspas do texto
     * @param pTexto
     * @return 
     */
    public String tirarAspas(String pTexto){
         while(pTexto.contains("\"")){
        
            pTexto = pTexto.replace("\"", " ");
        }
        
        return pTexto;
    }
    
    /**
     * Tratar pagina HTML trocando caracteres especiais por padrão
     * @param p_Texto
     * @return 
     * @author Paulo Henrique
     */
    
    public String trocarCaracterEspecial(String p_Texto)
    {
        CleasingCaracterEspecialDao cd = new CleasingCaracterEspecialDao();
        String retorno = p_Texto;
        List<CleasingCaracterEspecial> lista = new ArrayList<CleasingCaracterEspecial>();
        
        lista = cd.retornaListaCaracterEspecial();
        
        for (CleasingCaracterEspecial e : lista)  {
            if(retorno.contains(e.getCleasing_caracter_especial())){
                retorno = retorno.replace(e.getCleasing_caracter_especial(), e.getCleasing_caracter_correto());
            } 
        }
    
        return retorno;
    
    }
    
    /**
     * Tratar pagina HTML trocando caracteres especiais por padrão
     * @param p_Texto
     * @param pHmCaracater
     * @return 
     */
    public String trocarCaracterEspecial(String p_Texto, HashMap pHmCaracater )
    {
        String retorno = p_Texto;
               
        // Get a set of the entries
        Set set = pHmCaracater.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
           Map.Entry me = (Map.Entry)i.next();
           
           if(retorno.contains(me.getKey().toString())){
               retorno = retorno.replace(me.getKey().toString(), me.getValue().toString());
           }
           
        }
           
        return retorno;
    
    }
    
       
    /**
     * Tratar texto removendo tags Html encontradas
     * @param p_Texto
     * @return 
     * @author Paulo Henrique
     */
    public String trocarTagsHtml(String p_Texto)
    {
        CleasingTagsHtmlDao cd = new CleasingTagsHtmlDao();
        String retorno = p_Texto;
        List<CleasingTagsHtml> lista = new ArrayList<CleasingTagsHtml>();
        
        lista = cd.retornaListaTagsHtml();
        
        for (CleasingTagsHtml e : lista)  {
            if(retorno.contains(e.getCleasing_tags_html())){
                retorno = retorno.replace(e.getCleasing_tags_html(), " ");
            } 
        }
    
        return retorno;
    
    }
    
    /**
     * Tratar texto removendo tags Html encontradas
     * @param p_Texto
     * @param pHmTag
     * @return 
     */
    public String trocarTagsHtml(String p_Texto, HashMap pHmTag)
    {
        
        String retorno = p_Texto;
                
        // Get a set of the entries
        Set set = pHmTag.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
           Map.Entry me = (Map.Entry)i.next();
           
           if(retorno.contains(me.getKey().toString())){
               retorno = retorno.replace(me.getKey().toString(), me.getValue().toString());
           }
           
        }
    
        return retorno;
    
    }

}
