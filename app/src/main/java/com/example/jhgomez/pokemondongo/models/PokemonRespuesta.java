package com.example.jhgomez.pokemondongo.models;

import java.util.ArrayList;

/**
 * Created by JhGomez on 23/05/2017.
 */

public class PokemonRespuesta
{
    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results)
    {
        this.results = results;
    }
}
