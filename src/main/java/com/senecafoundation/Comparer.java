package com.senecafoundation;

public class Comparer {

    private PokemonWithSecondAbility userPokemon;
    private PokemonWithSecondAbility strangerPokemon;
    private String strangersName;

    public Comparer(PokemonWithSecondAbility userPokemon, PokemonWithSecondAbility strangerPokemon, String strangersName) {
        this.userPokemon = userPokemon; 
        this.strangerPokemon = strangerPokemon; 
        this.strangersName = strangersName; 
    }

    public void comparePokemon() {
        System.out.println("-- Your Pokemon --" + System.lineSeparator() + "Pokemon: " + this.userPokemon.getName() + System.lineSeparator() 
        + "HP: " + this.userPokemon.getHp() + System.lineSeparator() 
        + "Attack: " + this.userPokemon.getAttack() + System.lineSeparator() 
        + "Defense: " + this.userPokemon.getDefense() + System.lineSeparator() 
        + "spDefense: " + this.userPokemon.getSpDefense() + System.lineSeparator() 
        + "spAttack: " + this.userPokemon.getSpAttack() + System.lineSeparator() 
        + "Speed: " + this.userPokemon.getSpeed() + System.lineSeparator() 
        + "Ability: " + this.userPokemon.getAbility1() + System.lineSeparator() 
        + "Type: " + this.userPokemon.getPokemonType() + System.lineSeparator() 
        + "Effectiveness: " + this.userPokemon.getTypeEffectiveness() + System.lineSeparator() 
        + "Weakness: " + this.userPokemon.getTypeWeakness() 
        + System.lineSeparator() +

        ("-- " + this.strangersName + "'s Pokemon --" + System.lineSeparator() + "Pokemon: " + this.strangerPokemon.getName() + System.lineSeparator() 
        + "HP: " + this.strangerPokemon.getHp() + System.lineSeparator() 
        + "Attack: " + this.strangerPokemon.getAttack() + System.lineSeparator() 
        + "Defense: " + this.strangerPokemon.getDefense() + System.lineSeparator() 
        + "spDefense: " + this.strangerPokemon.getSpDefense() + System.lineSeparator() 
        + "spAttack: " + this.strangerPokemon.getSpAttack() + System.lineSeparator() 
        + "Speed: " + this.strangerPokemon.getSpeed() + System.lineSeparator() 
        + "Ability: " + this.strangerPokemon.getAbility1() + System.lineSeparator() 
        + "Type: " + this.strangerPokemon.getPokemonType() + System.lineSeparator() 
        + "Effectiveness: " + this.strangerPokemon.getTypeEffectiveness() + System.lineSeparator() 
        + "Weakness: " + this.strangerPokemon .getTypeWeakness()));
    }
}
