public class ChallengerPokedex {
   Boolean screenIsLitUp2;
   List<ActualPokemon> pokemons = new List<ActualPokemon>();
    
   public ChallengerPokedex(boolean screenIsLitUp2){
       this.screenIsLitUp2 = screenIsLitUp2;
   }
   public boolean getscreenIsLitUp2(){
      return this.screenIsLitUp2;
   }

       public List<ActualPokemon>getpokemons(){
           return this.pokemons;
       } 
       this.setpokemons = value;
}
