/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.entities;

/**
 *
 * @author Paulo
 */
public class Foto {
    private int _foto_id;
    private int _link_id;
    private String _foto_url;
    private String _foto_url_original;

    public int getFoto_id() {
        return _foto_id;
    }

    public void setFoto_id(int _foto_id) {
        this._foto_id = _foto_id;
    }

    public int getLink_id() {
        return _link_id;
    }

    public void setLink_id(int _link_id) {
        this._link_id = _link_id;
    }

    public String getFoto_url() {
        return _foto_url;
    }

    public void setFoto_url(String _foto_url) {
        this._foto_url = _foto_url;
    }

    public String getFoto_url_original() {
        return _foto_url_original;
    }

    public void setFoto_url_original(String _foto_url_original) {
        this._foto_url_original = _foto_url_original;
    }
    
    
    
}
