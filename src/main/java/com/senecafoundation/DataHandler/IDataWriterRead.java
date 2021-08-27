package com.senecafoundation.DataHandler;

import java.util.List;

import com.senecafoundation.PokedexItem;
import com.senecafoundation.PokemonWithSecondAbility;

public interface IDataWriterRead {
    public PokedexItem Read(String ID) throws Exception;
    public List<PokedexItem> ReadAll();
    public List<PokemonWithSecondAbility> ReadAll2();
    public List<PokemonWithSecondAbility> ReadAll3();
}


