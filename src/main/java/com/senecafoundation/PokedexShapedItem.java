package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class PokedexShapedItem extends PokedexItem {
    protected String shape;
    
    public PokedexShapedItem(String color,String shape, IDataWriter dataHolder) {
        super(color, dataHolder);
        this.shape = shape;        
    }   

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getColor(); 
    }

    //add getter and setter for PokedexShapedItem
    //Or Refactor 
}
