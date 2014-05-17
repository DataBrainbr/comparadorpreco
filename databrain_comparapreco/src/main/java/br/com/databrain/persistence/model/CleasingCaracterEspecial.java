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
@Table(name="cleasing_caracter_especial")
public class CleasingCaracterEspecial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cleasing_car_esp_id;
    private String cleasing_caracter_especial;
    private String cleasing_caracter_correto;

    public Long getId() {
        return cleasing_car_esp_id;
    }

    public void setId(Long id) {
        this.cleasing_car_esp_id = cleasing_car_esp_id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cleasing_car_esp_id != null ? cleasing_car_esp_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CleasingCaracterEspecial)) {
            return false;
        }
        CleasingCaracterEspecial other = (CleasingCaracterEspecial) object;
        if ((this.cleasing_car_esp_id == null && other.cleasing_car_esp_id != null) || (this.cleasing_car_esp_id != null && !this.cleasing_car_esp_id.equals(other.cleasing_car_esp_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.databrain.peristense.model.cleasing_caracter_especial[ cleasing_car_esp_id=" + cleasing_car_esp_id + " ]";
    }

    /**
     * @return the cleasing_caracter_especial
     */
    public String getCleasing_caracter_especial() {
        return cleasing_caracter_especial;
    }

    /**
     * @param cleasing_caracter_especial the cleasing_caracter_especial to set
     */
    public void setCleasing_caracter_especial(String cleasing_caracter_especial) {
        this.cleasing_caracter_especial = cleasing_caracter_especial;
    }

    /**
     * @return the cleasing_caracter_correto
     */
    public String getCleasing_caracter_correto() {
        return cleasing_caracter_correto;
    }

    /**
     * @param cleasing_caracter_correto the cleasing_caracter_correto to set
     */
    public void setCleasing_caracter_correto(String cleasing_caracter_correto) {
        this.cleasing_caracter_correto = cleasing_caracter_correto;
    }
    
    
    
    
}
