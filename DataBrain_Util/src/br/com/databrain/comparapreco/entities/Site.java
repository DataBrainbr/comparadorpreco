package br.com.databrain.comparapreco.entities;

/**
 *
 * @author Paulo
 */
public class Site {
    private int id;
    private String url;

    /**
     * retorna id do site
     */
    public int getId() {
        return id;
    }

    /**
     * seta o valor do id do site
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
    
    
}
