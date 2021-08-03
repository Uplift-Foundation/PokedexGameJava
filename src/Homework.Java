public class Homework extends PokedexShapeitem {  //add in PokedexShapedItem as parent
    
    private String shape; 

    private int words;

    private Boolean FoldAction;

    public Homework( String shape, int words, Boolean FoldAction){
        this.setShape(shape);
        this.setWords(words);
        this.setFoldAction(foldAction);
        
    }
    
}