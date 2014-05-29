/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.databrain.robocapturatag;

import br.com.databrain.dao.mysql.ConexaoMySql;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TesteTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ConexaoMySql conexao = new ConexaoMySql();
        String strTexto = new String();
        String strOpt = new String();
        strOpt = JOptionPane.showInputDialog(null,"Deseja incluir ou excluir? (I/E) ");
        if ("I".equals(strOpt.toUpperCase())) {
            strTexto = JOptionPane.showInputDialog(null,"Entre com o valor para cadastro: ");
            try {
                salvarTeste(strTexto);
            } catch (Exception ex) {
                System.out.println("Erro ao gravar registro");
            }            
        } else {
            strTexto = JOptionPane.showInputDialog(null,"Entre com o valor para excluir: ");
            
            try {
                excluirTeste(strTexto);
            } catch (Exception ex) {
                System.out.println("Erro ao excluir registro");
            }            
        }
       
        System.out.println("teste gustavo");
    }

    public static void salvarTeste(String strTexto) throws Exception {
        String comando = "INSERT INTO teste (teste) VALUES ('" + strTexto + "')";
        ConexaoMySql executar = new ConexaoMySql();
        executar.executarComando(comando);
    }
    
    public static void excluirTeste(String strTexto) throws Exception {
        String comando = "DELETE FROM teste WHERE teste = '" + strTexto + "'";
        ConexaoMySql executar = new ConexaoMySql();
        executar.executarComando(comando);
    }    
}
