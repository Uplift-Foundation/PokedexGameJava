public class ActualPokemon extends PokedexItem {
   
    private String ability1; 
     
    public ActualPokemon(String color,String ability1) {
        super(color);
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