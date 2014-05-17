/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.persistence.dao;

import javax.persistence.EntityManager;
import br.com.databrain.persistence.model.EtlLink;

/**
 *
 * @author Paulo
 */
public class EtlLinkDao {
    
    EntityManager em = JPAUtil.getEntitymanager();
    
    public void salvarLink(EtlLink _link){
        
        em.getTransaction().begin();
        em.persist(_link);
        em.getTransaction().commit();
        
        em.close();
    }
    
}
