public class FlyTrap extends Plant {
    private String fly;


    public FlyTrap(String color, String shape, String smell, Boolean hasLeaves, Boolean hasRoots,
            Boolean collectsSunLight, Boolean makesGlucose, String fly) {
        super(color, shape, smell, hasLeaves, hasRoots, collectsSunLight, makesGlucose);
        this.fly = fly;
    }
    //method
    public String Photosynthesizes(){
        if (fly.isEmpty()){
            return "There is no fly to eat...";
        }
        fly = "";
        return "Om. The fly trap eats the fly!";
    }
}