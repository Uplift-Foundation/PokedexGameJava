package com.senecafoundation;
import java.util.List;

public class PokemonType {
    private String name;
    private List<String> abilities;
    private String weakness;
    private String effectiveness;

    // public PokemonType(
    //     String name,
    //     List<String> abilities,
    // )
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getWeakness()
    {
        return weakness;
    }
    public void setWeakness(String weakness)
    {
        this.weakness = weakness;
    }
    public String getEffectiveness()
    {
        return effectiveness;
    }
    public void setEffectiveness(String effectiveness)
    {
        this.effectiveness = effectiveness;
    }
    public List<String> getAbilities(){
        return abilities;
    }
    public void setAbilities(List<String> abilities)
    {
        this.abilities = abilities;
    }
}

