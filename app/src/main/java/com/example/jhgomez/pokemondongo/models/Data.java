package com.example.jhgomez.pokemondongo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by JhGomez on 28/05/2017.
 */

public class Data
{
    /**
     * Atributos nombre, y experiencia
     */
    private String name;
    private String base_experience;

    /**
     * Metodos get y set
     */
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBase_experience()
    {
        return base_experience;
    }

    public void setBase_experience(String base_experience)
    {
        this.base_experience = base_experience;
    }
}
