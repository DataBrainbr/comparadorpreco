package br.com.databrain.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class ConexaoMySql {

    Connection conbco;
    
        public Connection abrirConexao() {

        //atributo do tipo Connection 
        //Connection connection = null;
        try {
            // Carregando o JDBC Driver padrão 
            String driver = "com.mysql.jdbc.Driver";  //classe driver JDBC
            String banco = "db_sistema";  //nome do banco
            String host = "localhost";  //maquina onde está o banco
            String str_conn = "jdbc:mysql://" + host + ":3307/" + banco; //URL de conexao
            String usuario = "root";
            String senha = "admin";
            
            Class.forName(driver); //carrega driver
            
            conbco = DriverManager.getConnection(str_conn, usuario, senha);
            Statement stmt = conbco.createStatement();//cria stament para mandar um sql pra o banco
            
            System.out.println("conectou!");
        } catch (ClassNotFoundException e) {
            //Driver não encontrado 
            System.out.println("O driver especificado nao foi encontrado.");
            return null;
        } 
        catch (SQLException e) {
            //Não conseguindo se conectar ao banco 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;
        }
        return null;
    }

    public void executarComando(String comandoSQL) throws Exception {
        Connection con = null;

        try {
            abrirConexao();
        } catch (Exception ex) {
            throw ex;
        }
        try {
            String conexao = new String();
            Statement comando = (Statement)conbco.createStatement();
            // Insere retornando o ID criado.
            comando.executeUpdate(comandoSQL);

        } catch (Exception ex) {
            throw ex;
        } finally {
            //fecharDB();
        }
    }
}
