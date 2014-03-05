package br.com.databrain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Paulo
 */
public class ConexaoBanco {

    public Connection abrirConexao(){
     
        Connection connection = null; 

        //atributo do tipo Connection 
        try { 
        // Carregando o JDBC Driver padrão 
            String driverName = "com.mysql.jdbc.Driver"; 
            
            Class.forName(driverName); 
            // Configurando a nossa conexão com um banco de dados// 
            String serverName = "localhost:3307"; 
            //caminho do servidor do BD 
            String mydatabase ="db_sistema"; 
            //nome do seu banco de dados 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 
            String username = "root"; 
            //nome de um usuário de seu BD 
            String password = "admin"; 
            //sua senha de acesso 
            connection = DriverManager.getConnection(url, username, password); 

        //Testa sua conexão// 
           // if (connection != null) { 
             //   status = ("STATUS--->Conectado com sucesso!");
          //  } else { 
          //      status = ("STATUS--->Não foi possivel realizar conexão"); } 
            
            return connection; 
           } 

        catch (ClassNotFoundException e) { 
        //Driver não encontrado 
            System.out.println("O driver expecificado nao foi encontrado."); 
            e.printStackTrace();
            return null; } 
        
        catch (SQLException e) { 
            //Não conseguindo se conectar ao banco 
            System.out.println("Nao foi possivel conectar ao Banco de Dados."); 
       
            return null; 
        } 
        
    }
    
}
