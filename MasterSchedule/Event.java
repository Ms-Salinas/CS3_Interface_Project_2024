/** 
 * Event objects have a name and dayOf the event, both instance variables.
 * Have accessor and mutator methods for each instance variable
 * @author Joshua Vento-Jones
 **/

public class Event {

    public String name; // Holds String name of the event
    public int dayOf; // Holds the day of the event (1-365)

    // Constructor of the event object, instantiates name and dayOf.
    public Event(String name, int dayOf){
        this.name = name;
        this.dayOf = dayOf;
    }

    // Returns the name of the event object.
    public String getName(){
        return name;
    }
    
    // Returns the day of the event object.
    public int getDayOf(){
        return dayOf;
    }

    // Modifies the name of the event object to the String name parameter
    public void setName(String name){
        this.name = name;
    }
    
    // Modifies the day of the event object to the int dayOf parameter
    public void setDayOf(int dayOf){
        this.dayOf = dayOf;
    }

    // Returns the name and the date of the event
    public String toString(){
        return name + " on day: " + dayOf;
    }
}
