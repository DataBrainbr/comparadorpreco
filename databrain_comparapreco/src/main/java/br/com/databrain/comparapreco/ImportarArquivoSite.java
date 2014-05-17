/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.comparapreco;

import java.util.List;  
import java.util.Arrays;
import br.com.databrain.util.ArquivoTexto;
import br.com.databrain.persistence.model.EtlLink;
import br.com.databrain.persistence.dao.EtlLinkDao;

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
        EtlLinkDao etlDao = new EtlLinkDao();
        List<String> dados = Arrays.asList();
        ArquivoTexto pr = new ArquivoTexto();
        EtlLink etl = new EtlLink();
        String[] array;      
        
        try
        {
            dados = pr.lerArquivo(pArquivo);
            
            for (String e : dados)  {
                
                array = e.split("\\|");
                
                etl.setLoja_cliente_id(1);
                etl.setProduto_url("teste");
                etl.setProduto_nome(array[0].toString());
                etl.setProduto_preco(array[1].toString());
                etl.setProduto_foto(array[2].toString());
                etl.setProduto_descricao(array[3].toString());  
                
               
                etlDao.salvarLink(etl);
            }
        }
        
        catch(Exception ex){
            
          
        }
       
    }
}