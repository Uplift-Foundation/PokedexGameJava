public class Peony extends Plant {
    private Boolean hasNectar;

    public Peony(String color, String shape, String smell, Boolean hasLeaves, Boolean hasRoots, Boolean hasNectar,
            Boolean collectsSunLight, Boolean makesGlucose) {
        super(color, shape, smell, hasLeaves, hasRoots, collectsSunLight, makesGlucose);
        this.hasNectar = hasNectar;
    }
    //method
    public String Photosynthesizes(){
        return "everybody dance now";
    }
}