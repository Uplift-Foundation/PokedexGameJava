public class Homework extends PokedexShapeitem {  //add in PokedexShapedItem as parent
    
    private String shape; 

    private int words;

    private Boolean FoldAction;

    public Homework(String color,String shape,int words,Boolean FoldAction){ 
        super(color,shape);
        this.setShape(shape);
        this.setWords(words);
        this.setFoldAction(foldAction);
    }
    public String getshape(){
        return shape;
    } 
    public int getwords(){
        return words;
    }
    public Boolean getFoldAction(){
        return FoldAction;
    }
    public void setShape( String shape){
       this.shape = shape;
    }
    public void setWords( int words){
        this.words = words;
    }
    public void setFoldAction(){
        this.FoldAction = FoldAction;
    }
        //methods
        public String getsCrumbled(){
            if (FoldAction && words > 1 && shape =="circle") {
                return "This is someone's homework...I hope they're not missing it.";
            }
            return "This homework is still okay.";
        }
    
}