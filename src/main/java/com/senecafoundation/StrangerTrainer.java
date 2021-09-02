package com.senecafoundation;

import java.util.List;
import java.util.Random;

import com.senecafoundation.DataHandler.IDataWriter;

public class StrangerTrainer extends PokemonTrainer {

    public StrangerTrainer(IDataWriter dataHolder, String name) {
        super(dataHolder, name);
    }
    
    public void populateFromRandom(IDataWriter fileThatContainsLongListOfPokemon) {
        Random rd = new Random();
        List<PokedexItem> ChallengerContents = fileThatContainsLongListOfPokemon.ReadAll();
        for (int i = 0; i < 6; i++ ){
            PokedexItem itemToAdd = ChallengerContents.get(rd.nextInt(ChallengerContents.size()));
            SixPokemon.add(itemToAdd);            
            this.getIDataWriter().Create(itemToAdd);
        }
    }
}
