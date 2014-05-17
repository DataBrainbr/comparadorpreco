/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.persistence.model;

import java.io.Serializable;
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
@Table(name="etl_link")
public class EtlLink implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int loja_cliente_id;
    private String produto_url;
    private String produto_nome;
    private String produto_foto;
    private String produto_preco;
    private String produto_descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof EtlLink)) {
            return false;
        }
        EtlLink other = (EtlLink) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.databrain.persistence.model.EtlLink[ id=" + id + " ]";
    }

    public int getLoja_cliente_id() {
        return loja_cliente_id;
    }

    public void setLoja_cliente_id(int loja_cliente_id) {
        this.loja_cliente_id = loja_cliente_id;
    }

    public String getProduto_url() {
        return produto_url;
    }

    public void setProduto_url(String produto_url) {
        this.produto_url = produto_url;
    }

    public String getProduto_nome() {
        return produto_nome;
    }

    public void setProduto_nome(String produto_nome) {
        this.produto_nome = produto_nome;
    }

    public String getProduto_foto() {
        return produto_foto;
    }

    public void setProduto_foto(String produto_foto) {
        this.produto_foto = produto_foto;
    }

    public String getProduto_descricao() {
        return produto_descricao;
    }

    public void setProduto_descricao(String produto_descricao) {
        this.produto_descricao = produto_descricao;
    }

    public String getProduto_preco() {
        return produto_preco;
    }

    public void setProduto_preco(String produto_preco) {
        this.produto_preco = produto_preco;
    }
    
    
    
}
