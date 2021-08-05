import java.util.ArrayList;
import java.util.List;

public class ChallengerPokedex {
    Boolean screenIsLitUp2;
    List<ActualPokemon> pokemons = new ArrayList<ActualPokemon>();
    
    public ChallengerPokedex(Boolean screenIsLitUp2){
       this.screenIsLitUp2 = screenIsLitUp2;
    }
    public Boolean getScreenIsLitUp2(){
        return this.screenIsLitUp2;
    }

    public List<ActualPokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<ActualPokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
