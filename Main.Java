// tests interface fitnesstracker and prints out statements regarding the content of fitness tracker.
public class Main
{
    public static void main(String[] args) {
        
        FitnessTracker running = new Running(30,5.0);
        
        FitnessTracker lifting = new Lifting(40,250.0);
        
        FitnessTracker walking = new Walking(45, 3.0);
        
        FitnessTracker sport = new Sport(120, "Baseball");
        
      System.out.println("Running:");
System.out.println("Calories Burned: " + running.caloriesBurned() );
System.out.println("Time spent: " + running.amountOfTime() + " Minutes");

      System.out.println("Baseball:");
System.out.println("Calories Burned: " + sport.caloriesBurned());
System.out.println("Time spent: " + sport.amountOfTime() + " Minutes" + "\n");

      System.out.println("Walking:");
System.out.println("Calories Burned: " + walking.caloriesBurned());
System.out.println("Time spent: " + walking.amountOfTime() + " Minutes" + "\n");

      System.out.println("Lifting:");
System.out.println("Calories Burned: " + lifting.caloriesBurned());
System.out.println("Time spent: " + lifting.amountOfTime() + " Minutes");

    }
}

