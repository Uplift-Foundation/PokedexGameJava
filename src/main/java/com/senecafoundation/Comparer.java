package com.senecafoundation;

public class Comparer {
//  add extends ICompare 

    private PokemonWithSecondAbility pokemon1;

    private PokemonWithSecondAbility pokemon2; 

    public Comparer(PokemonWithSecondAbility RandomPokemon1, PokemonWithSecondAbility RandomPokemon2) {
        this.pokemon1 = RandomPokemon1; 
        this.pokemon2 = RandomPokemon2;
    }
//  method
    public String Comparison() {
        //Pokemon pokemon1;
        return("-- Your Pokemon --" + System.lineSeparator() + "Pokemon: " + pokemon1.getName() + System.lineSeparator() 
        + "HP: " + pokemon1.getHp() + System.lineSeparator() 
        + "Attack: " + pokemon1.getAttack() + System.lineSeparator() 
        + "Defense: " + pokemon1.getDefense() + System.lineSeparator() 
        + "spDefense: " + pokemon1.getSpDefense() + System.lineSeparator() 
        + "spAttack: " + pokemon1.getSpAttack() + System.lineSeparator() 
        + "Speed: " + pokemon1.getSpeed() + System.lineSeparator() 
        + "Ability: " + pokemon1.getAbility1() + System.lineSeparator() 
        + "Type: " + pokemon1.getPokemonType() + System.lineSeparator() 
        + "Effectiveness: " + pokemon1.getTypeEffectiveness() + System.lineSeparator() 
        + "Weakness: " + pokemon1.getTypeWeakness() 
        + System.lineSeparator() +
        //Pokemon pokemon2;
        ("-- Stranger's Pokemon --" + System.lineSeparator() + "Pokemon: " + pokemon2.getName() + System.lineSeparator() 
        + "HP: " + pokemon2.getHp() + System.lineSeparator() 
        + "Attack: " + pokemon2.getAttack() + System.lineSeparator() 
        + "Defense: " + pokemon2.getDefense() + System.lineSeparator() 
        + "spDefense: " + pokemon2.getSpDefense() + System.lineSeparator() 
        + "spAttack: " + pokemon2.getSpAttack() + System.lineSeparator() 
        + "Speed: " + pokemon2.getSpeed() + System.lineSeparator() 
        + "Ability: " + pokemon2.getAbility1() + System.lineSeparator() 
        + "Type: " + pokemon2.getPokemonType() + System.lineSeparator() 
        + "Effectiveness: " + pokemon2.getTypeEffectiveness() + System.lineSeparator() 
        + "Weakness: " + pokemon2 .getTypeWeakness()));
    }
    public PokemonWithSecondAbility getPokemon1()
    {
        return this.pokemon1;
    }

    public void setPokemon1(PokemonWithSecondAbility RandomPokemon1)
    {
        this.pokemon1 = RandomPokemon1;
    }

    public PokemonWithSecondAbility getPokemon2()
    {
        return this.pokemon2;
    }

    public void setPokemon2(PokemonWithSecondAbility RandomPokemon2)
    {
        this.pokemon2 = RandomPokemon2;
    }
    
}
