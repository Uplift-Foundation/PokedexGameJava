public class ActualPokemon extends PokedexItem {
   
    private String ability; //change name to ability1
    //add ability2

    //change this code accordingly and add code for ability2
    public ActualPokemon(String color,String ability) {
        super(color);
        this.setAbility(ability);
    }
    
    public String getAbility()
    {
        return ability; 
    }
    public void setAbility(String ability)
    {
        this.ability = ability; 
    }
}