package com.senecafoundation;

import java.util.UUID;

import com.senecafoundation.DataHandler.IDataWriter; 

public abstract class PokedexItem {
    //states
    protected String color;
    private String ID; 
    private IDataWriter dataWriter; 
    //  public String Color { get => color; set => color = value; }
    
    public PokedexItem(String color, IDataWriter dataHolder) 
    {
        this.dataWriter = dataHolder;
        this.setColor(color);
        this.setID(UUID.randomUUID().toString());
    }

    public String getID() {
		return ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IDataWriter getIDataWriter() {
        return dataWriter;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getColor();
    }
}