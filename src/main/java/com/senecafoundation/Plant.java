package com.senecafoundation;

import com.senecafoundation.DataHandler.IDataWriter;

public class Plant extends PokedexItem {  //add in PokedexItem as a parent to this. Plant is the child 

    private String smell;

    private Boolean hasLeaves;

    private Boolean hasRoots;

    private Boolean collectsSunLight;

    private Boolean makesGlucose;
    

    public Plant(String color, String smell, Boolean hasLeaves, Boolean hasRoots, Boolean collectsSunLight, Boolean makesGlucose, IDataWriter dataHolder) { 
        super(color, dataHolder);
        this.smell = smell;
        this.hasLeaves = hasLeaves;
        this.hasRoots = hasRoots;
        this.collectsSunLight = collectsSunLight;
        this.makesGlucose = makesGlucose;
    }
    public String getSmell(){
        return smell; 
    }
    public Boolean getHasLeaves(){
        return hasLeaves;
    }
    public Boolean getHasRoots(){ //do all the yellows from 22-50 have to be uppercased? Ask Warren. 
        return hasRoots; 
    }
    public Boolean getCollectsSunLight(){
        return collectsSunLight;
    }
    public Boolean getMakesGlucose(){
        return makesGlucose;
    }
    public void setSmell(String smell){
        this.smell = smell;
    }
    public void setHasLeaves(Boolean hasLeaves){
        this.hasLeaves = hasLeaves; 
    }
    public void setHasRoots(Boolean hasRoots){
        this.hasRoots = hasRoots; 
    }
    public void setCollectsSunLight(Boolean collectsSunLight){
        this.collectsSunLight = collectsSunLight;
    }
    public void setMakesGlucose(Boolean makesGluecose){
        this.makesGlucose = makesGluecose;
    }

    //methods 

    public String Photosynthesizes() {
        if (collectsSunLight && makesGlucose) {
            return "This plant can do the photosynthesizing";
        }
        return "This plant is DEAD"; 
        //Unreachable code?? 
    }
    
    public String Grows(){
        if (color == "green" && smell == "fresh" && hasLeaves && hasRoots) {
            return "This is a plant... not sure what in tarnation it's doing here";
        }
        return "This plant is not growing... maybe try actually taking care of the things you own?";
    }

    public Boolean hasDied() {
        if (smell == "rotten" && color == "brown") {
            return true;
        }
        return false; 
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "," + this.getID() + "," + this.getColor() + "," + this.getSmell() + "," + this.getHasLeaves().toString() + "," + this.getHasRoots().toString() + "," + this.getCollectsSunLight().toString() + "," + this.getMakesGlucose().toString();
    }

}
