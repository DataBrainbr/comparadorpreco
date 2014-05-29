package br.com.databrain.comparapreco.dao;

import br.com.databrain.dao.mysql.ConexaoMySql;
import br.com.databrain.entities.Site;

/**
 *
 * @author Gustavo
 */
public class SiteDAO {
    public void atualizarSite(Site site){
        String comandoSQL = "UPDATE db_sistema.site SET " +
                " site_ProdutoIni = '" + site.getProdutoIni() + "'," +
                " site_ProdutoFim = '" + site.getProdutoFim() + "'," +
                " site_PrecodIni = '" + site.getPrecoIni() + "'," +
                " site_PrecoFim = '" + site.getPrecoFim() + "'," +
                " site_DescricaoIni = '" + site.getDescricaoIni() + "'," +
                " site_DescricaoFim = '" + site.getDescricaoFim() + "'," +
                " WHERE Site_URL = '" + site.getUrl() +"'";
        ConexaoMySql con = null;
        try {
            con.executarComando(comandoSQL);
        } catch (Exception ex) {
            System.out.println("Nao foi possivel executar a instrução desejada. " + ex.getMessage());
        }
    }
}
