package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class Homework extends PokedexItem {

    private String shape;

    private Integer words;

    private Boolean foldAction;

    private PokemonWithSecondAbility myCharmander;

    public Homework(String color, String shape, Integer words, Boolean foldAction, PokemonWithSecondAbility charmanderFromUser, IDataWriter dataHolder) {
        super (color, dataHolder);
        this.shape = shape; 
        this.words = words; 
        this.foldAction = foldAction; 
        this.myCharmander = charmanderFromUser;
    }

    public String getShape(){
        return this.shape;
    }
    public Integer getWords(){
        return this.words;
    }
    public Boolean getFoldAction(){
        return this.foldAction;
    }
    public void setShape(String shape){
        this.shape = shape;
    }
    public void setWords(Integer words){
        this.words = words;
    }
    public void setfoldAction(Boolean foldAction){
        this.foldAction = foldAction;
    }

    public String getsCrumbled(){
        if (foldAction && words > 1 && shape == "circle"){
            return "This is someone's homework ... maybe you should give it back";
        }
        return "This homework is still isn't crumbled";
    }

    public String getAnExcuse() {
        return "My " + myCharmander.getName() + " ate it";
    }
}