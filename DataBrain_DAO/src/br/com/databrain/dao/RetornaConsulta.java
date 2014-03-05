/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.dao;

import java.sql.*;

/**
 *
 * @author Paulo
 */
public class RetornaConsulta {
    
   /**
    * Retorna um result set da consulta informada
    * @param SQL
    * @return 
    */
   public ResultSet RetornaResulSet(String SQL){
       
    try{
           
        ConexaoBanco conexao = new ConexaoBanco();
        Connection conn = conexao.abrirConexao();

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(SQL);

        st.close();
        
        return rs;
       }
    
    catch (Exception e)
    {
      System.err.println("Exceção ao retornar result set");
      System.err.println(e.getMessage());
      return null;
    }
       
       
       
   }
}
