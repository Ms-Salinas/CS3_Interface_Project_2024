import java.util.ArrayList;

/** 
 * SportsSchedule adds sports events to the schedule, given a name and dayOf
 * The event through setEvent. ALl events are stored in the calendar ArrayList.
 * Sports events are games and are listed as so.
 * @author Joshua Vento-Jones 
 **/

public class SportsSchedule implements MasterSchedule{
    
    // Edited to create necessary instance variables
    public ArrayList<Event> calendar = new ArrayList<Event>();


    // Sets what will happen and on what day, adds event to the sport calendar.
    // Edited to be a mutator method taking in parameters name and dayOf
    // Updates sport, dayOf, event, and calendar instance variables.
    public String setEvent(String name, int dayOf){
        calendar.add(new Event(name + " Game", dayOf));
        return "The " + name + " game has been scheduled for day " + dayOf + "!";
    }

    // Returns what will happen on a given day 
    // Prints out the calendar, with each event on a new line.
    public String getEvent(){
        String result = "";
        for(Event i : calendar){
            result+=i + "\n";
        }
        return result;
    }


    // Precondition: All events in calendar have different days
    // Sets reminder for day parameter, notifies if an event is happening
    // On the day of or day after the day parameter.
    public String reminder(int day){

        for(Event i : calendar){
            if(day-i.getDayOf()==0){
                return i.getName() + " is happening TODAY!";
            }
            else if(day-i.getDayOf()==-1){
                return i.getName() + " is happening tomorrow!";
            }
        }
        return "No reminders...";
           
    }
    //Days that have passed (Edit: Since the last event)
    // Takes in day parameter, returns the amount of days since the last event.
    // If there was no event before the day parameter, returns 0.
    public int dayPassed(int day){
        for(Event i : calendar){
            if(day-i.getDayOf()>0){
                return day-i.getDayOf();
            }
        }
        return 0;
    }
}
