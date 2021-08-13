package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    public static final String shape = "Rectangle";
    public static final String color = "Red";
    boolean screenIsLitUp;
    List<PokedexItem> pokemonsAndStuff = new ArrayList<PokedexItem>();
    List<PokemonWithSecondAbility> tempPokemon = new ArrayList<PokemonWithSecondAbility>();

    public Pokedex(boolean screenIsLitUp) {
        this.screenIsLitUp = screenIsLitUp;
    }

    public static String getColor() {
        return color;
    }
    public static String getShape() {
        return shape;
    }

    public boolean getScreenIsLitUpString() {
        return screenIsLitUp;
    }

    public void setScreenIsLitUp(boolean screenIsLitUp) {
        this.screenIsLitUp = screenIsLitUp;
    }

    public List<PokedexItem> getPokemonsAndStuff() { //ask Warren about what this does because trying to run Java says the arguements are not applicable. 
        return pokemonsAndStuff;
    }

    public void setPokemonsAndStuff(List<PokedexItem> pokemonsAndStuff) {
        this.pokemonsAndStuff = pokemonsAndStuff;
    }

    public List<PokemonWithSecondAbility> getTempPokemon() {
        return tempPokemon;
    }

    public void setTempPokemon(List<PokemonWithSecondAbility> tempPokemon) {
        this.tempPokemon = tempPokemon;
    }
}
