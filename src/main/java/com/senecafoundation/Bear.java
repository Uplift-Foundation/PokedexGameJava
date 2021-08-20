package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class Bear extends PokedexItem {

    //states
    private String shape;
    private Integer weight; 
    private Boolean scary;


    public Bear(String color, String shape, Boolean scary, Integer weight, IDataWriter dataHolder) {
        super(color, dataHolder);
        this.shape = shape;
        this.weight = weight;
        this.scary = scary;
    
    } 


    public String getShape(){
        return shape;
    }
    public Integer getWeight(){
        return weight;

    }
    public Boolean getScary(){
        return scary;
    }
    public void setShape(String shape){
        this.shape = shape;
    }
    public void setWeight(Integer weight){
        this.weight = weight;
    }
    public void setScary(Boolean scary){
        this.scary = scary;
    }

    
    //Methods
    public Boolean attacks() {
        if (weight > 200 && scary == true) {
            return true;

        }
        return false; 
    }
    public String roll() {
        if (weight > 150 && shape == "circle") {
            return "This is a bear...it's definitly scary, but not a pokemon. maybe try again.";
        
        }
        return "He will NOT roll";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getColor() + "," + this.getShape() + "," + this.getScary().toString() + "," + this.getWeight().toString();
    }
}
