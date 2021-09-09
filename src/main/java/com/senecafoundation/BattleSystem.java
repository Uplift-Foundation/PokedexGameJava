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


    
}
