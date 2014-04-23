/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco.dao;

import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.entities.Produto;
import java.sql.SQLException;

/**
 *
 * @author Paulo
 */
public class ComparaprecoDao {
    
    /**
     * 
     * @param pProduto 
     */
    public void inserirLinkBanco(Produto pProduto)
    {
        StringBuilder sb = new StringBuilder();
        ConexaoMySql cn = new ConexaoMySql();
        
        sb.append("Insert Into etl_link "
                + "(Loja_Cliente_Id, Produto_Nome, Produto_Preco, Produto_Foto, Produto_Descricao) "
                + "Values (");
        sb.append(pProduto.getId());
        sb.append(",");
        sb.append("'");
        sb.append(pProduto.getNomeProduto());
        sb.append("' ,");
        sb.append("'");
        sb.append(pProduto.getPrecoProduto());
        sb.append("' ,");
        sb.append("'");
        sb.append(pProduto.getFotoProduto());
        sb.append("' ,");
        sb.append("'");
        sb.append(pProduto.getDescricaoProduto());
        sb.append("');");
        
        try {
            cn.executarComando(sb.toString());
        }
        
        catch (SQLException e) {
            //Não conseguindo se conectar ao banco 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
        }
        
        catch(Exception ex){
            System.out.println("Problemas para execuar inserção dos dados");
            System.out.println(ex.getMessage());
        }
        
        finally{
            
            cn.FecharConexao();
            
        }
                
    }
    
}
