package com.senecafoundation;

public class PokedexShapedItem extends PokedexItem {
    protected String shape;
    
    public PokedexShapedItem(String color,String shape) {
        super(color);
        this.shape = shape;        
    }   
}
