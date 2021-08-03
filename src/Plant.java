public class Plant {

    private String smell;

    private Boolean hasLeaves;

    private Boolean hasRoots;

    private Boolean collectsSunLight;

    private Boolean makesGlucose;
    

    public Plant(String smell, Boolean hasLeaves, Boolean hasRoots, Boolean collectsSunLight, Boolean makesGlucose) { //capital took off some of the sqiggles? 
        this.setSmell(smell);
        this.setHasLeaves(hasLeaves);
        this.setHasRoots(hasRoots);
        this.setCollectsSunLight(collectsSunLight);
        this.setMakesGlucose(makesGlucose);
    }
    public String getSmell(){
        return smell; 
    }
    public Boolean getHasLeaves(){
        return hasLeaves;
    }
    public Boolean getHasRoots(){
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
    
    
}
