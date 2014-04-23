/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.entities;

/**
 * Classe abstratada para uso no tratamento de caracteres
 * @author Paulo
 */
public abstract class CleasingTratamentoDePara {
    
    private String caracterDe;
    private String caracterPara;

    /**
     * @return the caracterDe
     */
    public String getCaracterDe() {
        return caracterDe;
    }

    /**
     * @param caracterDe the caracterDe to set
     */
    public void setCaracterDe(String caracterDe) {
        this.caracterDe = caracterDe;
    }

    /**
     * @return the caracterPara
     */
    public String getCaracterPara() {
        return caracterPara;
    }

    /**
     * @param caracterPara the caracterPara to set
     */
    public void setCaracterPara(String caracterPara) {
        this.caracterPara = caracterPara;
    }
    
}
