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
public class Preco extends Produto{
    private int _idPreco;
    private double _valor;

    public int getIdPreco() {
        return _idPreco;
    }

    public void setIdPreco(int _idPreco) {
        this._idPreco = _idPreco;
    }

    public double getValor() {
        return _valor;
    }

    public void setValor(double _valor) {
        this._valor = _valor;
    }
    
    
    
}
