/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco.dao;

import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.entities.Produto;
import br.com.databrain.util.dao.CleasingDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de acesso ao banco de dados. Referência as classes do pacote br.com.databrain.comparapreco
 * @author Paulo
 */
public class ComparaprecoDao {
    
    /**
     * Inserir link importado do crawler para base ETL
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
    /**
     * Retornar lista de produtos/links carregados para tratamento
     * @return 
     */
    public List<Produto>cleasingRetornaLinksETL(){
        
        ConexaoMySql cn = new ConexaoMySql();
        
        StringBuilder sb = new StringBuilder();
        sb.append("Select loja_cliente_Id, produto_nome, produto_preco, produto_foto," +
                "produto_descricao, produto_url From etl_link");
        
        List<Produto> retorno = new ArrayList<Produto>();
        
        try{
            
            ResultSet rs = cn.retornarResultSet(sb.toString());
        
             while(rs.next()){
                Produto prd = new Produto();
                
                prd.setNomeProduto(rs.getString("produto_nome"));
                prd.setPrecoProduto(rs.getString("produto_preco"));
                prd.setFotoProduto(rs.getString("produto_foto"));
                prd.setDescricaoProduto(rs.getString("produto_descricao"));
                prd.setUrl(rs.getString("produto_url"));
                prd.setId(rs.getInt("loja_cliente_Id"));
                
                retorno.add(prd);
            }
                         
            return retorno;
        }
        
        catch(SQLException ex){
            
            return retorno;
        } 
        
        catch (Exception ex) {
            Logger.getLogger(CleasingDao.class.getName()).log(Level.SEVERE, null, ex);
            return retorno;
        }       
        
         finally{
            
            cn.FecharConexao();
            
        }
    }
        
    /**
     * Inserir link tratado do crawler para base tratada
     * @param pProduto 
     */
    public void inserirLinkTratado(Produto pProduto)
    {
        StringBuilder sb = new StringBuilder();
        ConexaoMySql cn = new ConexaoMySql();
        
        sb.append("Insert Into etl_link_tratado "
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
