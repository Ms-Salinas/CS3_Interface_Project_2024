/**The Cookies subclass implements the RecipeFinder interface to display a recipe for cake mix cookies.
@implementor Kenedi Carson*/
public class Cookies implements RecipeFinder{
     
    /*Create two lists, the first stores the ingredients(String[]) the second contains the amount of each ingredient (double[])*/ 
    private String[] ingredients = {" Box of cake mix (any flavor!)", "eggs", 
    "cups vegetable oil"};
    private double[] measurements = {1.0, 2.0, 0.4};
    
    /**
     listIngredients() prints out the needed ingredients and their measurements for the recipe*/
    public void listIngredients(){
        System.out.println("Ingredients for Cake mix Cookies: ");
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
        System.out.println("Once scooped, bake the cookies at 350 degrees for 12 minutes, or until golden brown.");
    }
    
    /**
     assemble() will take in a String parameter stating 
     whether the food item is being stacked, adding toppings, or mixing. 
     param: String instruction
     */
    public void assemble(String instruction){
        System.out.println(instruction + " your finished cookies on a plate and serve.");
    }
    
    /**
     tidyUp() will prompt to the user what they might need
     to clean or throw away throughout the assembly process. 
     */
    public void tidyUp(){
        System.out.println("Make sure you wash your hands, mixer, countertops, bowls, and anything the raw eggs or cake mix may have touched!");
    }
}
