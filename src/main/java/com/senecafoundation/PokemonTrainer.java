package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

    public IDataWriter getIDataWriter() {
        return dataWriter;
    }

    public void populateFromRandom(IDataWriter fileThatContainsLongListOfPokemon) {
        Random rd = new Random();
        List<PokedexItem> ChallengerContents = fileThatContainsLongListOfPokemon.ReadAll();
        for (int i = 0; i < 6; i++ ){
            PokedexItem itemToAdd = ChallengerContents.get(rd.nextInt(ChallengerContents.size()));
            SixPokemon.add(itemToAdd);            
            this.dataWriter.Create(itemToAdd);
        }
    }

    public String getID(){
        return ID; 
    }

    private void setID(String id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<PokedexItem> getSixPokemon() {
        return SixPokemon;
    }

    public void setSixPokemon(List<PokedexItem> SixPokemon) {
        this.SixPokemon = SixPokemon; 
    }    
}
