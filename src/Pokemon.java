public class Pokemon extends ActualPokemon{
    private String name;
    private String avgSize; 
    private String pokemonType;
    private String region; 
    private Integer hp; 
    private Integer attack; 
    private Integer defense; 
    private Integer spDefense;
    private Integer spAttack; 
    private Integer speed; 
    private String typeEffectiveness;
    private String typeWeakeness; 

    
    public Pokemon(String name, String avgSize, String pokemonType, String region, Integer hp, Integer attack, Integer defense, Integer spDefense, Integer spAttack, Integer speed, String typeEffectiveness, String typeWeakness, String color, String ability) {
        super(color, ability);
        this.setName(name);
        this.setAvgSize(avgSize);
        this.setPokemonType(pokemonType);
        this.setRegion(region);
        this.setHp(hp);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setSpDefense(spDefense);
        this.setSpAttack(spAttack);
        this.setSpeed(speed);
        this.setTypeEffectiveness(typeEffectiveness);
        this.setTypeWeakness(typeWeakness);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name; 
    }

}
