public interface MasterSchedule{

    String setEvent();
    //Sets what will happen and on what day 
    String getEvent();
    //returns  what will happen on a given day 
    String reminder();
    //will return event one day before it happens to user
    int dayPassed();
    //Days that have passed 

}