package br.com.databrain.entities;

/**
 *
 * @author Paulo
 */
public class Site {
    private int id;
    private String url;
    private String caminhoFoto;
    private boolean status;
    private String produtoIni;
    private String produtoFim;
    private String precoIni;
    private String precoFim;
    private String descricaoIni;
    private String descricaoFim;
    
    

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setProdutoIni(String ProdutoIni) {
        this.produtoIni = ProdutoIni;
    }

    public void setProdutoFim(String ProdutoFim) {
        this.produtoFim = ProdutoFim;
    }

    public void setPrecoIni(String PrecoIni) {
        this.precoIni = PrecoIni;
    }

    public void setPrecoFim(String PrecoFim) {
        this.precoFim = PrecoFim;
    }

    public void setDescricaoIni(String descricaoIni) {
        this.descricaoIni = descricaoIni;
    }

    public void setDescricaoFim(String descricaoFim) {
        this.descricaoFim = descricaoFim;
    }

    public boolean isStatus() {
        return status;
    }

    public String getProdutoIni() {
        return produtoIni;
    }

    public String getProdutoFim() {
        return produtoFim;
    }

    public String getPrecoIni() {
        return precoIni;
    }

    public String getPrecoFim() {
        return precoFim;
    }

    public String getDescricaoIni() {
        return descricaoIni;
    }

    public String getDescricaoFim() {
        return descricaoFim;
    }

    /**
     * @return retorna id do site
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }
    
    
    
}
