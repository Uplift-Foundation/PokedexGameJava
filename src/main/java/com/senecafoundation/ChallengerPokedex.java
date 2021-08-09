package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;

public class ChallengerPokedex extends Pokedex {
    List<ActualPokemon> pokemons = new ArrayList<ActualPokemon>();
    public ChallengerPokedex(boolean screenIsLitUp) {
        super(screenIsLitUp);
    }
    public void setChallengerContents(List<ActualPokemon> challengerContents) { //public void created using quickfix from Apps 
    }

}
