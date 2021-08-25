package com.senecafoundation.DataHandler;

import java.util.List;

import com.senecafoundation.PokedexItem;

public interface IDataWriterRead {
    public PokedexItem Read(String ID) throws Exception;
    public List<PokedexItem> ReadAll();
}


