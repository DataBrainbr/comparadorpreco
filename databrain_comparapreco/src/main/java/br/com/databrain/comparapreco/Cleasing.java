/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;

import br.com.databrain.comparapreco.cleasing.CleasingTratamentoTexto;
import br.com.databrain.entities.*;
import br.com.databrain.comparapreco.dao.ComparaprecoDao;
import br.com.databrain.persistence.dao.CleasingCaracterEspecialDao;
import br.com.databrain.persistence.dao.CleasingTagsHtmlDao;
import br.com.databrain.persistence.model.*;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Paulo
 */
public class Cleasing {
  
    /*hashmaps que contem as bases de conhecimento*/
    HashMap hmCaracterEspecial = new HashMap();
    HashMap hmTagsHTML = new HashMap();
    
    /**
     * Iniciar tratamento da base capturada
     */
    public void tratarProdutoETL(){
        ComparaprecoDao dao = new ComparaprecoDao();
        
        
        carregarHashMapCaracterEspecial();
        carregarHashMapTagsHTML();
        
        try{
           
            List<Produto> produtos = new ArrayList<Produto>();
            produtos = dao.cleasingRetornaLinksETL();

            for (Produto e : produtos)  {
                
                Produto produtoTratado = new Produto();
                
                produtoTratado = e;
                
                /* falta métodos para tratar links */

                produtoTratado.setDescricaoProduto(tratarDescricaoProduto(e.getDescricaoProduto()));
                produtoTratado.setNomeProduto(tratarNomeProduto(e.getNomeProduto()));
                produtoTratado.setPrecoProduto(tratarPrecoProduto(e.getPrecoProduto()));
                produtoTratado.setFotoProduto(tratarFotoProdutoURL(e.getFotoProduto()));
                
                dao.inserirLinkTratado(produtoTratado);
            }
        }
        
        catch(Exception ex){
            
        }
        
    }
    
    /**
     * Carregar tabela conhecimento para HashMap de Caracter Especial
     */
    private void carregarHashMapCaracterEspecial(){
        //CleasingDao cs = new CleasingDao();
        CleasingCaracterEspecialDao cs = new CleasingCaracterEspecialDao();
        
        List<CleasingCaracterEspecial> retorno = new ArrayList<CleasingCaracterEspecial>();
        //retorno = cs.retornaListaCaracterEspecial();
        retorno = cs.retornaListaCaracterEspecial();
        
        for (CleasingCaracterEspecial e : retorno)  {
            hmCaracterEspecial.put(e.getCleasing_caracter_especial(), e.getCleasing_caracter_correto());
        } 
    }

    /**
     * Carregar tabela conhecimento para HashMap de Tags HTML
     */
    private void carregarHashMapTagsHTML(){
        CleasingTagsHtmlDao cs = new CleasingTagsHtmlDao();
        
        List<CleasingTagsHtml> retorno = new ArrayList<CleasingTagsHtml>();
        retorno = cs.retornaListaTagsHtml();
        
        for (CleasingTagsHtml e : retorno)  {
            hmTagsHTML.put(e.getCleasing_tags_html(), " ");
            
        } 
    }   
    
    /**
     * 
     * @param pProduto
     * @return 
     */
    public Produto tratarProduto(Produto pProduto){
        
        pProduto.setDescricaoProduto(tratarDescricaoProduto(pProduto.getDescricaoProduto()));
        pProduto.setNomeProduto(tratarNomeProduto(pProduto.getNomeProduto()));
        
        return pProduto;
    }
    
    
    /**
     * Tratar informações capturadas da descrição do produto
     * @param pTexto
     * @return 
     * @author Paulo Henrique
     */
    private String tratarDescricaoProduto(String pTexto){
        pTexto = tratamentoPadrao(pTexto);
        
        return pTexto;
    }
    
    /**
     * Tratar informações do nome do produto
     * @param pTexto
     * @return 
     */
     
    private String tratarNomeProduto(String pTexto){
        pTexto = tratamentoPadrao(pTexto);
        
        return pTexto;
        
    }
    
    /**
     * Tratar informações do preço do produto
     * @param pTexto
     * @return 
     */
    private String tratarPrecoProduto(String pTexto){
        pTexto = tratamentoPadrao(pTexto);
        pTexto = pTexto.replace("R$", "");
        
        return pTexto;
    }
    
      /**
     * Tratar informações da foto do produto
     * @param pTexto
     * @return 
     */
    private String tratarFotoProdutoURL(String pTexto){
        pTexto = tratamentoPadrao(pTexto);
        
        pTexto = pTexto.replace("http://", "");
        
        
                
            
            
        
        return pTexto;
    }
    
    
    /**
     * 
     * @param pTexto
     * @return 
     */
    private String tratamentoPadrao(String pTexto){
        CleasingTratamentoTexto tratar = new CleasingTratamentoTexto();
        
        pTexto = pTexto.trim();
        
        pTexto = tratar.trocarCaracterEspecial(pTexto, hmCaracterEspecial);
        pTexto = tratar.trocarTagsHtml(pTexto, hmTagsHTML);
        pTexto = tratar.tirarAspas(pTexto);
        pTexto = tratar.tirarEspacoDuplo(pTexto);
        
        return pTexto;
    }
  
}
