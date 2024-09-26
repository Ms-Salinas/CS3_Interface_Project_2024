// subclass of fitness tracker
class Running implements FitnessTracker {
    
    private int time;
    private double distance;

    // sets time and distance
    public Running(int time, double distance){
        this.time = time;
        this.distance = distance;
    }
    // returns the time times the amount of calories burned in a minute
    public double caloriesBurned(){
        return time * 11.5;
        
    }
    // returns the time
    public int amountOfTime(){
        return time;
    }
    // returns the distance ran per amount of time
    public double distanceRan(){
        return distance;
    }
  }
