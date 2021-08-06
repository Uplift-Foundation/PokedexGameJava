public class Homework extends PokedexItem {  //add in PokedexShapedItem as parent
    
    private String shape; 

    private int words;

    private Boolean foldAction;

    public Homework(String color,String shape,int words,Boolean foldAction){ 
        super(color,shape);
        this.shape = shape;
        this.words = words;
        this.foldAction = foldAction;
    }
    public String getshape(){
        return this.shape;
    } 
    public int getwords(){
        return this.words;
    }
    public Boolean getFoldAction(){
        return this.foldAction;
    }
    public void setShape( String shape){
       this.shape = shape;
    }
    public void setWords( int words){
        this.words = words;
    }
    public void setfoldAction(){
        this.foldAction = foldAction;
    }
        //methods
        public String getsCrumbled(){
            if (foldAction && words > 1 && shape =="circle") {
                return "This is someone's homework...I hope they're not missing it.";
            }
            return "This homework is still okay.";
        }
    
}