package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class ActualPokemon extends PokedexItem {
   
    private String ability1; 
     
    public ActualPokemon(String color,String ability1, IDataWriter dataHolder) {
        super(color, dataHolder);
        this.ability1 = ability1;
    }
    
    public String getAbility1()
    {
        return ability1; 
    }
    public void setAbility1(String ability1)
    {
        this.ability1 = ability1; 
    }
}