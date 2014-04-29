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
<<<<<<< HEAD
//    EntityManagerFactory factory = Persistence.createEntityManagerFactory("minhaapppersistenceunit");
//    EntityManager entityManager = factory.createEntityManager();

=======
    
<<<<<<< HEAD
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa
=======
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa
    public Connection abrirConexao() {

        try {
            // Carregando o JDBC Driver padrão 
            String driver = "com.mysql.jdbc.Driver";  //classe driver JDBC
            String banco = "db_sistema";  //nome do banco
            String host = "127.0.0.1";  //maquina onde está o banco
            String str_conn = "jdbc:mysql://" + host + ":3307/" + banco; //URL de conexao
<<<<<<< HEAD
            String usuario = "user_sistema";
            String senha = "!@#$data%¨&*brain";

=======
            String usuario = "root";
            String senha = "admin";
            
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa
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
<<<<<<< HEAD
<<<<<<< HEAD
/**
 * Encerra a conexão com o banco de dados
 * @author Gustavo
 */
    public Connection fecharConexao() {
=======
=======
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa
    
    public void FecharConexao()
    {
    
        try{
            if (!conbco.isClosed() )
            {
                conbco.close();
            }
        }
        catch(Exception ex){
            
        }
    }
<<<<<<< HEAD
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa
=======
>>>>>>> 58a7bb6a71271a1c3f960e5082cd551a39ea28fa

        try {
            conbco.close();
            if (conbco.isClosed()) {
                System.out.println("Conexão encerrada.");
            }
//Esta linha precisa descomentar, porém fica gerando erro.
//        } catch (ClassNotFoundException e) {
//            System.err.println("ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
        return null;
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
            fecharConexao();
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
