// @implementor Joshua Vento-Jones

public interface MasterSchedule{

    // Edited to add parameter for the mutator method
    //Sets what will happen and on what day 
    String setEvent(String name, int dayOf);


    //returns  what will happen on a given day 
    // Edit: Prints out the calendar, with each event on a new line.
    String getEvent();
    
    
    //will return event one day before it happens to user
    // Edit: Sets reminder for day parameter, notifies if an event is happening
    // On the day of or day after the day parameter.
    String reminder(int day);
    
    
    //Days that have passed 
    // Edit: Takes in day parameter, returns the amount of days since the last event.
    // If there was no event before the day parameter, returns 0.
    int dayPassed(int day);
    

}