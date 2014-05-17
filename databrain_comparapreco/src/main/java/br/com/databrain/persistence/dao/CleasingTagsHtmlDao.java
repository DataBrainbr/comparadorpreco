/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.persistence.dao;

import br.com.databrain.persistence.model.CleasingTagsHtml;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class CleasingTagsHtmlDao {
    
    EntityManager em = JPAUtil.getEntitymanager();
    
    /**
     * 
     * @return 
     */
    public List<CleasingTagsHtml> retornaListaTagsHtml(){
        
        Query q = em.createQuery("Select e from CleasingTagsHtml e");
        
        List<CleasingTagsHtml> results = q.getResultList();
        
        return results;        
    }
    
}
