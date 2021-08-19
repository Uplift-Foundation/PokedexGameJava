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
        this.setColor(color);
        this.ID = UUID.randomUUID().toString();
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
}