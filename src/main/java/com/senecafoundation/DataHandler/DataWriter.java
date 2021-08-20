package com.senecafoundation.DataHandler;

import java.io.FileNotFoundException;

import com.senecafoundation.PokedexItem;

public abstract class DataWriter implements IDataWriter {
	@Override
	public abstract void Create(PokedexItem item);
	
	@Override
	public abstract PokedexItem Read(String ID) throws Exception;

	@Override
	public abstract PokedexItem Update(PokedexItem itemToUpdate);

	@Override
	public abstract Boolean Delete(String ID) throws Exception;

	public String GetTypeOfProvider() {
		return this.toString();
	}
}