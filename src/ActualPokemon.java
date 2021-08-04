public class ActualPokemon extends PokedexItem {
   
    private String ability; 


    
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
//this should be correct 
