public class ActualPokemon extends PokedexItem {
   
    private String ability1; 
     
    private String ability2;

    //change this code accordingly and add code for ability2
    public ActualPokemon(String color,String ability1, String ability2) {
        super(color);
        this.ability1 = ability1;
        this.ability2 = ability2;
    }
    
    public String getAbility1()
    {
        return ability1; 
    }
    public String ability2()
    { 
        return ability2; 
    }
    public void setAbility1(String ability1)
    {
        this.ability1 = ability1; 
    }
    
    public void setAbility2(String ability2)
    {
        this.ability2 = ability2;

    }
}