/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;

import java.util.List;  
import java.util.Arrays;
import br.com.databrain.util.ArquivoTexto;
import br.com.databrain.entities.*;
import br.com.databrain.dao.mysql.ConexaoMySql;
import java.sql.SQLException;


/**
 *
 * @author Paulo
 */
public class ImportarArquivoSite {
    /**
     * 
     * @param pArquivo
     * @throws Exception 
     */
    public void importarArquivoSite(String pArquivo) throws Exception
    {
        List<String> dados = Arrays.asList();
        ArquivoTexto pr = new ArquivoTexto();
        Produto produto = new Produto();
        String[] array;      
        
        try
        {
            dados = pr.lerArquivo(pArquivo);
            
            for (String e : dados)  {
                
                array = e.split("\\|");
                
                produto.setId(1);
                produto.setNomeProduto(array[0].toString());
                produto.setPrecoProduto(array[1].toString());
                produto.setFotoProduto(array[2].toString());
                produto.setDescricaoProduto(array[3].toString());
                
                inserirLinkBanco(produto);
            }
        }
        
        catch(Exception ex){
            
          
        }
       
    }

    /**
     * 
     * @param pProduto 
     */
    private void inserirLinkBanco(Produto pProduto)
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
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
                
    }

}
