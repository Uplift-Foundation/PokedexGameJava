package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class PokemonWithSecondAbility extends Pokemon {
    protected String ability2;

    public PokemonWithSecondAbility(
        String name, 
        String avgSize, 
        String color, 
        String pokemonType, 
        String region,
        Integer hp, 
        Integer attack, 
        Integer defense, 
        Integer spDefense, 
        Integer spAttack, 
        Integer speed,
        String ability1,
        String ability2, 
        String typeEffectiveness, 
        String typeWeakness, 
        IDataWriter dataHolder
    ) {
        super(
            name, 
            avgSize, 
            color, 
            pokemonType, 
            region, 
            hp, 
            attack, 
            defense, 
            spDefense, 
            spAttack, 
            speed, 
            ability1,
            typeEffectiveness, 
            typeWeakness, 
            dataHolder
        );
    } 
    public String getAbility2() {
        return ability2;
    }
    public void setAbility2(String ability2){
        this.ability2 = ability2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getName() + "," +  this.getAvgSize() + "," + this.getColor() + "," + this.getPokemonType() + "," + this.getRegion() + "," + this.getHp().toString() + "," + this.getAttack().toString() + "," + this.getDefense().toString() + "," + this.getSpDefense().toString() + "," + this.getSpAttack().toString() + "," + this.getSpeed().toString() + "," + this.getAbility1() + "," + this.getAbility2() + "," +  this.getTypeEffectiveness() + "," + this.getTypeWeakness();
    }
    
}
