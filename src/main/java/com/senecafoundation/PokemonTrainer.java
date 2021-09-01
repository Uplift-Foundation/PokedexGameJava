package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.senecafoundation.DataHandler.IDataWriter;

public class PokemonTrainer {

    private IDataWriter dataWriter; 
    private String ID; 
    private String name; 
    List<PokedexItem> SixPokemon = new ArrayList<PokedexItem>();

    public PokemonTrainer(IDataWriter dataHolder, String name)
    {
        this.dataWriter = dataHolder;
        this.name = name; 
        this.setID(UUID.randomUUID().toString());
    }


    public String getID(){
        return ID; 
    }

    private void setID(String id) {
        this.ID = id;
    }


    
}
