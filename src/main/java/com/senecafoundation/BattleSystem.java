package com.senecafoundation;

public class BattleSystem {

    private Boolean PlayerTurn; 
    private Boolean EnemyTurn; 
    private String PokemonMoves; 
    private Integer PlayerPokemonHealth; 
    private Integer EnemyPokemonHealth; 
    private String ChooseAMove; 

    public BattleSystem (
        Boolean PlayerTurn, 
        Boolean EnemyTurn, 
        String PokemonMoves, 
        Integer PlayerPokemonHealth, 
        Integer EnemyPokemonHealth, 
        String ChooseAMove){
            this.PlayerTurn = PlayerTurn; 
            this.EnemyTurn = EnemyTurn; 
            this.PokemonMoves = PokemonMoves; 
            this.PlayerPokemonHealth = PlayerPokemonHealth;
            this.EnemyPokemonHealth = EnemyPokemonHealth; 
            this.ChooseAMove = ChooseAMove;
        }
    
    public Boolean getPlayerTurn(){
        return PlayerTurn;
    }
    public void setPlayerTurn (Boolean PlayerTurn){
        this.PlayerTurn = PlayerTurn; 
    }
    public Boolean getEnemyTurn(){
        return EnemyTurn; 
    }
    public void setEnemyTurn (Boolean EnemyTurn){
        this.EnemyTurn = EnemyTurn; 
    }
    public String getPokemonMoves(){
        return PokemonMoves;
    }
    public void setPokemonMoves (String PokemonMoves){
        this.PokemonMoves = PokemonMoves;
    }
    public Integer getPlayerPokemonHealth(){
        return PlayerPokemonHealth; 
    }
    public void setPlayerPokemonHealth(Integer PlayerPokemonHealth){
        this.PlayerPokemonHealth = PlayerPokemonHealth; 
    }
    public Integer getEnemyPokemonHealth(){
        return EnemyPokemonHealth;
    }
    public void setEnemyPokemonHealth(Integer EnemyPokemonHealth){
        this.EnemyPokemonHealth = EnemyPokemonHealth; 
    }
    public String getChooseAMove(){
        return ChooseAMove; 
    }
    public void setChooseAMove(String ChooseAMove){
        this.ChooseAMove = ChooseAMove;
    }

    //Methods 
    

    
}
