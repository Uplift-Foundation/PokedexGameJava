package com.senecafoundation;

public class Comparer {

    private PokemonWithSecondAbility pokemon1;

    private PokemonWithSecondAbility pokemon2; 


    public Comparer(PokemonWithSecondAbility pokemonfromuser1, PokemonWithSecondAbility pokekemonfromuser2) {
        this.pokemon1 = pokemonfromuser1; 
        this.pokemon2 = pokekemonfromuser2;
    }
    public String Comparison() {
        //Pokemon pokemon1;
        System.out.println("-- Your Pokemon --" + System.lineSeparator() 
        + "Pokemon: " + pokemon1.getName() + System.lineSeparator() 
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
        );
        //Pokemon pokemon2;
        System.out.println("-- Stranger's Pokemon --" + System.lineSeparator() 
        + "Pokemon: " + pokemon2.getName() + System.lineSeparator() 
        + "HP: " + pokemon2.getHp() + System.lineSeparator() 
        + "Attack: " + pokemon2.getAttack() + System.lineSeparator() 
        + "Defense: " + pokemon2.getDefense() + System.lineSeparator() 
        + "spDefense: " + pokemon2.getSpDefense() + System.lineSeparator() 
        + "spAttack: " + pokemon2.getSpAttack() + System.lineSeparator() 
        + "Speed: " + pokemon2.getSpeed() + System.lineSeparator() 
        + "Ability: " + pokemon2.getAbility1() + System.lineSeparator() 
        + "Type: " + pokemon2.getPokemonType() + System.lineSeparator() 
        + "Effectiveness: " + pokemon2.getTypeEffectiveness() + System.lineSeparator() 
        + "Weakness: " + pokemon2 .getTypeWeakness());
       
    }
    public PokemonWithSecondAbility getPokemon1()
    {
        return this.pokemon1;
    }

    public void setPokemon1(PokemonWithSecondAbility pokemonfromuser1){
        this.pokemon1 = pokemonfromuser1;
    }
    
}
