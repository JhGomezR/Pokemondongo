package com.example.jhgomez.pokemondongo.pokeapi;

import com.example.jhgomez.pokemondongo.models.Data;
import com.example.jhgomez.pokemondongo.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by JhGomez on 23/05/2017.
 */

public interface PokeapiService
{
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);

    @GET("pokemon/{id}/")
    Call<Data> dataPokemon(@Path("id") int id);
}
