// subclass of fitness tracker
class Sport implements FitnessTracker {
    
    private int time;
    private String sport;
// sets time. As well as sportplayed
    public Sport(int time, String sport){
        this.time = time;
        this.sport = sport;
    }
// returns the amount of time spent times the avg amount of calories burned per minute 
    public double caloriesBurned(){
        return time * 6;
        
    }
  //returns the amount of time spent
   public int amountOfTime(){
        return time;
    }
 // returns the sport the person plays
   public String sportPlayed(){
        return sport;
    }
}
