package br.com.databrain.entities;

/**
 *
 * @author Paulo
 */
public class Produto extends Site{
    private String _idUrl;
    private String _url;
    private String _nomeProduto;
    private String _precoProduto;
    private String _descricaoProduto;
    private String _fotoProduto;

    /**
     * @return the _nomeProduto
     */
    public String getNomeProduto() {
        return _nomeProduto;
    }

    /**
     * @param _nomeProduto the _nomeProduto to set
     */
    public void setNomeProduto(String _nomeProduto) {
        this._nomeProduto = _nomeProduto;
    }

    /**
     * @return the _precoProduto
     */
    public String getPrecoProduto() {
        return _precoProduto;
    }

    /**
     * @param _precoProduto the _precoProduto to set
     */
    public void setPrecoProduto(String _precoProduto) {
        this._precoProduto = _precoProduto;
    }

    /**
     * @return the _descricaoProduto
     */
    public String getDescricaoProduto() {
        return _descricaoProduto;
    }

    /**
     * @param _descricaoProduto the _descricaoProduto to set
     */
    public void setDescricaoProduto(String _descricaoProduto) {
        this._descricaoProduto = _descricaoProduto;
    }

    /**
     * @return the _fotoProduto
     */
    public String getFotoProduto() {
        return _fotoProduto;
    }

    /**
     * @param _fotoProduto the _fotoProduto to set
     */
    public void setFotoProduto(String _fotoProduto) {
        this._fotoProduto = _fotoProduto;
    }

    /**
     * @return the _idUrl
     */
    public String getIdUrl() {
        return _idUrl;
    }

    /**
     * @param _idUrl the _idUrl to set
     */
    public void setIdUrl(String _idUrl) {
        this._idUrl = _idUrl;
    }

    /**
     * @return the _url
     */
    @Override
    public String getUrl() {
        return _url;
    }

    /**
     * @param _url the _url to set
     */
    @Override
    public void setUrl(String _url) {
        this._url = _url;
    }
}
