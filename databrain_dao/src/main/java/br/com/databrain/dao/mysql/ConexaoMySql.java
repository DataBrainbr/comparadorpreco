package br.com.databrain.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
     

/**
 *
 * @author Gustavo
 */
public class ConexaoMySql {

    Connection conbco;
    
    public Connection abrirConexao() {

        try {
            // Carregando o JDBC Driver padrão 
            String driver = "com.mysql.jdbc.Driver";  //classe driver JDBC
            
//            String banco = "db_sistema";  //nome do banco
//            String host = "127.0.0.1";  //maquina onde está o banco
//            String str_conn = "jdbc:mysql://" + host + ":3307/" + banco; //URL de conexao
//
            //Servidor remoto
            String host = "192.186.200.73";  //maquina onde está o banco
            String banco = "db_sistema";  //nome do banco
            String str_conn = "jdbc:mysql://" + host + ":3306/" + banco; //URL de conexao
            String usuario = "user_sistema";
            String senha = "db@!2014L";

            
            
            Class.forName(driver); //carrega driver

            conbco = DriverManager.getConnection(str_conn, usuario, senha);
            Statement stmt = conbco.createStatement();//cria stament para mandar um sql pra o banco

            System.out.println("conectou!");
            
        } catch (ClassNotFoundException e) {
            //Driver não encontrado 
            System.out.println("O driver especificado nao foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco 
            System.out.println("Nao foi possivel conectar ao Banco de Dados. " + e.getMessage());

            return null;
        }
        return null;
    }

/**
 * Encerra a conexão com o banco de dados
 * @author Gustavo
 */
 
    public void FecharConexao(){
    
        try{
            if (!conbco.isClosed() )
            {
                conbco.close();
            }
        }
        catch(Exception ex){
            
        }
    }

/**
 * 
 * @param comandoSQL = Instrução SQL a ser executada (insert, update, delete...)
 * Abre a conexão com o banco de dados, excuta a instrução e encerra a conexão.
 * @throws Exception 
 */
    public void executarComando(String comandoSQL) throws Exception {
        Connection con = null;

        try {
            abrirConexao();
        } catch (Exception ex) {
            throw ex;
        }
        try {
            String conexao = new String();
            Statement comando = (Statement) conbco.createStatement();
            // Insere retornando o ID criado.
            comando.execute(comandoSQL);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            FecharConexao();
        }
    }
    
    public ResultSet retornarResultSet(String pSQL)throws Exception{
        Connection con = null;

        try {
            abrirConexao();
        } 
        catch (Exception ex) {
            throw ex;
        }
        try {
            
            Statement stmt = (Statement)conbco.createStatement();
            ResultSet retorno = stmt.executeQuery(pSQL);
            
            return retorno;
           
        }
        catch (SQLException sqle) {  
            return null;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } 
        
        finally{
            //fecharconexao
        }
    }
}
