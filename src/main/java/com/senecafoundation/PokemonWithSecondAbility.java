package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class PokemonWithSecondAbility extends Pokemon {
    protected String ability2;

    public PokemonWithSecondAbility(String name, String avgSize, String color, String pokemonType, String region,
            Integer hp, Integer attack, Integer defense, Integer spDefense, Integer spAttack, Integer speed,
            String ability1,String ability2, String typeEffectiveness, String typeWeakness, IDataWriter dataHolder) {
        super(name, avgSize, color, pokemonType, region, hp, attack, defense, spDefense, spAttack, speed, ability1,
                typeEffectiveness, typeWeakness, dataHolder);
    } 
    public String getAbility2() {
        return ability2;
    }
    public void setAbility2(String ability2){
        this.ability2 = ability2;
    }
    
}
