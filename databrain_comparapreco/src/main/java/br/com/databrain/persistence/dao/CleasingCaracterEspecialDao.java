/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.persistence.dao;

import javax.persistence.EntityManager;
import br.com.databrain.persistence.model.CleasingCaracterEspecial;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Paulo
 */
public class CleasingCaracterEspecialDao {
    
    EntityManager em = JPAUtil.getEntitymanager();
    
    /**
     * 
     * @return 
     */
    public List<CleasingCaracterEspecial> retornaListaCaracterEspecial(){
        
        Query q = em.createQuery("Select e from CleasingCaracterEspecial e");
        
        List<CleasingCaracterEspecial> results = q.getResultList();
        
        return results;
        
        
    }
    
}
