/**This class is implemented off of Alarm Clock for Military time.
 * METHOD LIST:
 * setAlarmTime()
 * snooze()
 * getAlarmTime()
 * getClockTime()
 * isAlarmSet()
 * activateAlarm()
 * deactivateAlarm()
 * ring()
  */
class Alarm2 implements AlarmClock{
    /**
     Missing instance variables (Added)
     */
    private int hour;
    private int minute;
    private int alarmHour;
    private int alarmMinute;
    private boolean isSet;
    /**
      Constructor for the instance variables hour and mintutes of the normal clock
     */
    public Alarm2(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        alarmHour = 6;
        alarmMinute = 00; 
        isSet = false;
    }
    /**
      Sets the alarm time.
       @param hour the hour to set the alarm
       @param minute the minute to set the alarm
     */
    public void setAlarmTime(int newHour, int newMinute){
        if (newHour <= 23 && (newMinute >= 0 && newMinute <= 59)){
            alarmHour = newHour;
            alarmMinute = newMinute;
            isSet = true;
        }
    }
    
    
    /**
     Snoozes the alarm for a specified duration.
     @param duration the duration in minutes to snooze the alarm
     */
    public void snooze(int minutes){
        System.out.println("Alarm clock set to snooze for " + minutes + " minutes.");
    }
    
    
    /**
     Method to get the alarm time.
     @returns the alarm time that it was set to
     */
    public String getAlarmTime(){
        String alarmHourWord = "";
        String alarmMinuteWord = "";
        if (alarmHour < 10){
            alarmHourWord = "0" + Integer.toString(alarmHour); 
        }
        else{
            alarmHourWord = Integer.toString(alarmHour);
        }
        if (alarmMinute < 10){
            alarmMinuteWord = "0" + Integer.toString(alarmMinute); 
        }
        else{
            alarmMinuteWord = Integer.toString(alarmMinute);
        }
        return alarmHourWord + ":" + alarmMinuteWord;
    }
    
    /**
     Method to get the alarm time.
     @returns the alarm time that it was set to
     */
    public String getClockTime(){
        String hourWord = "";
        String minuteWord = "";
        if (hour < 10){
            hourWord = "0" + Integer.toString(hour); 
        }
        else{
            hourWord = Integer.toString(hour);
        }
        if (minute < 10){
            minuteWord = "0" + Integer.toString(minute); 
        }
        else{
            minuteWord = Integer.toString(minute);
        }
        
        return hourWord + ":" + minuteWord;
    }
    

    /**
      Checks if the alarm is currently set.
      @return true if the alarm is set, false otherwise
     */
    public boolean isAlarmSet(){
        if (isSet == true){
            return true; 
        }
        else{
            return false;
        }
    }

    /**
      Activates the alarm.
      @return true if the alarm was successfully activated, false otherwise
     */
    public boolean activateAlarm(){
        if (isSet = true && (getClockTime().equals(getAlarmTime()))){
            return isSet;
        }
        else{
            return isSet;
        }
    }
    
    /**
      Method to ring the alarm
     */
    public void ring(){
        if (isSet == true){
            System.out.println("RING, RING, RING, get up you bum.");
        }
        else{
            System.out.println("There is no alarm set.");
        }
    } 
    
    

    /**
      Deactivates the alarm.
     */
    public void deactivateAlarm(){
        isSet = false;
        System.out.println("ALARM STOPPED");
    }
}
