/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.util.cleasing;

import br.com.databrain.entities.*;
import java.sql.ResultSet;
import br.com.databrain.util.dao.CleasingDao;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Paulo
 */
public class CleasingUtil {
    
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
     * Tratar pagina HTML trocando caracteres especiais por padrão
     * @param p_Texto
     * @return 
     * @author Paulo Henrique
     */
    public String trocarCaracterEspecial(String p_Texto)
    {
        CleasingDao cd = new CleasingDao();
        String retorno = p_Texto;
        List<CleasingCaracterEspecial> lista = new ArrayList<CleasingCaracterEspecial>();
        
        lista = cd.retornaListaCaracterEspecial();
        
        for (CleasingCaracterEspecial e : lista)  {
            if(retorno.contains(e.getCaracterDe())){
                retorno = retorno.replace(e.getCaracterDe(), e.getCaracterPara());
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
        CleasingDao cd = new CleasingDao();
        String retorno = p_Texto;
        List<CleasingTagsHtml> lista = new ArrayList<CleasingTagsHtml>();
        
        lista = cd.retornaListaTagsHtml();
        
        for (CleasingTagsHtml e : lista)  {
            if(retorno.contains(e.getCaracterDe())){
                retorno = retorno.replace(e.getCaracterDe(), e.getCaracterPara());
            } 
        }
    
        return retorno;
    
    }

}
