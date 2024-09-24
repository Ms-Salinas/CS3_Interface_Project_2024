/**
    This is the interface of RecipeFinder 
    
    @author Jailyn Perales
    @implementor Kenedi Carson
*/
public interface RecipeFinder{
   
    /**
     *
     This method listIngredients() will list all the ingredients needed. 
    */
    void listIngredients();
    
    
    
    /**
     This method gatherIngredients() will take in a int parameter 
     and multiply the ingredients needed by the mount being made. 
    */
    void gatherIngredients(int amount);
    
    
    
    /**
     This method bake() will tell the user how long and at what temperature to bake, cook, or grill. 
     */
    void bake();
    
    
    
    /**
     This method assemble() will take in a String parameter stating 
     whether the food item is being stacked, adding toppings, or mixing. 
     */
    void assemble(String instruction);
    
    
    
    /**
     This method tidyUp() will prompt to the user what they might need
     to clean or throw away through out the assemble process. 
     */
    void tidyUp();
    
    
}
