package com.example.jhgomez.pokemondongo.models;

/**
 * Created by JhGomez on 23/05/2017.
 */

public class Pokemon
{
    /**
     * Atributos
     */
    private int number;
    private String name;
    private String url;

    /**
     * metodos get y set
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber()
    {
        String[] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }
}
