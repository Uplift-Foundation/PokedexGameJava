package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class PokedexShapedItem extends PokedexItem {
    protected String shape;
    
    public PokedexShapedItem(String color,String shape, IDataWriter dataHolder) {
        super(color, dataHolder);
        this.shape = shape;        
    }   
}
