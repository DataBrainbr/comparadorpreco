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
