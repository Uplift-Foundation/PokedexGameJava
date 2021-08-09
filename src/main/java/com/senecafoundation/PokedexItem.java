package com.senecafoundation;

public class PokedexItem {
    //states
    protected String color;
    //  public String Color { get => color; set => color = value; }
    
    public PokedexItem(String color)
    {
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}