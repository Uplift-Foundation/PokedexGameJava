import java.util.ArrayList;
import java.util.List;

public class ChallengerPokedex extends Pokedex {
    List<ActualPokemon> pokemons = new ArrayList<ActualPokemon>();
    public ChallengerPokedex(boolean screenIsLitUp) {
        super(screenIsLitUp);
    }

}
