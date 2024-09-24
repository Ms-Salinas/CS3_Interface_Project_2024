/**The ChickenTenders subclass implements the RecipeFinder interface to display a recipe for chicken tenders.
@implementor Kenedi Carson*/
public class ChickenTenders implements RecipeFinder{
     
     /*Create two lists, the first stores the ingredients(String[]) the second contains the amount of each ingredient (double[])*/
    private String[] ingredients = {"chicken breasts, sliced in 1 inch strips", "cups All-Purpose Flour", 
    "teaspoons of salt", "teaspoons black pepper", "eggs", "tablespoons of water", "cups vegetable oil"};
    private double[] measurements = {2.0, 1.5, 0.75, 0.5, 2.0, 2.0, 0.75};
    
    /**
     listIngredients() prints out the needed ingredients and their measurements for the recipe*/
    public void listIngredients(){ 
        System.out.println("Ingredients for Chicken Tenders: ");
        for(int i = 0; i < ingredients.length; i++) {
            System.out.println(measurements[i] + " " + ingredients[i]);
        }
    }
    
    /**
     gatherIngredients() multiplies the ingredients needed by the amount being made. 
     param: int amount
    */
    public void gatherIngredients(int amount){
        for(int i = 0; i < measurements.length; i++) {
            measurements[i] = measurements[i] * amount;
        }
    }
    
    /**
     bake() will tell the user how long and at what temperature to bake, cook, or grill. 
     */
    public void bake(){
        System.out.println("Once dredged, fry the chicken at 365 degrees until golden, and until the temperature checks internally at 165 degrees.");
    }
    
    /**
     assemble() will take in a String parameter stating 
     whether the food item is being stacked, adding toppings, or mixing. 
     param: String instruction
     */
    public void assemble(String instruction){
        System.out.println(instruction + " your finished tenders on a plate and serve.");
    }
    
    /**
     tidyUp() will prompt to the user what they might need
     to clean or throw away throughout the assembly process. 
     */
    public void tidyUp(){
        System.out.println("Make sure you sanitize your cutting boards, countertops, bowls, and anything the raw chicken, eggs, or flour may have touched!");
    }
}
