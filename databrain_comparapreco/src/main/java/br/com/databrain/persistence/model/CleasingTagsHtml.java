/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.persistence.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name="cleasing_tags_html")
public class CleasingTagsHtml implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cleasing_tags_html_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String cleasing_tags_html;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCleasing_tags_html() {
        return cleasing_tags_html;
    }

    public void setCleasing_tags_html(String cleasing_tags_html) {
        this.cleasing_tags_html = cleasing_tags_html;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CleasingTagsHtml)) {
            return false;
        }
        CleasingTagsHtml other = (CleasingTagsHtml) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.databrain.persistence.model.CleasingTagsHtml[ id=" + id + " ]";
    }
    
}
