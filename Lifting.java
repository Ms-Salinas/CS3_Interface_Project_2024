// subclass of fitness tracker
class Lifting implements FitnessTracker {
   
    private int time;
    private double weightlifted;
    // sets the amount of time and the amount of weights lifted
    public Lifting(int time, double weightlifted){
        this.time = time;
        this.weightlifted = weightlifted;
    }
  //returns the avg amount of calories burned over an amount of time
    public double caloriesBurned(){
        return time * 8;
        
    }
    // returns time
    public int amountOfTime(){
        return time;
    }
    // returns the amount of weight lifted
    public double amountLifted(){
        return weightlifted;
    }
   }
