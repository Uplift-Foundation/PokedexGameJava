package com.senecafoundation.DataHandler;

import com.senecafoundation.PokedexItem;

public abstract class DataWriter implements IDataWriter {
	@Override
	public abstract void Create(PokedexItem item);
	
	@Override
	public abstract PokedexItem Read(String ID);

	@Override
	public abstract PokedexItem Update(PokedexItem itemToUpdate);

	@Override
	public abstract Boolean Delete(String ID);

	public String GetTypeOfProvider() {
		return this.toString();
	}
}