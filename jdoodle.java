# AlarmClock Interface

/**
 * This interface defines the structure for an Alarm Clock.
 * @ author Fabian Fuentes
 */
public interface AlarmClock {

    /**
     * Sets the alarm time.
     * 
     * @param hour the hour to set the alarm
     * @param minute the minute to set the alarm
     */
    void setAlarmTime(int hour, int minute);

    /**
     * Snoozes the alarm for a specified duration.
     * 
     * @param duration the duration in minutes to snooze the alarm
     */
    void snooze(int duration);

    /**
     * Checks if the alarm is currently set.
     * 
     * @return true if the alarm is set, false otherwise
     */
    boolean isAlarmSet();

    /**
     * Activates the alarm.
     * 
     * @return true if the alarm was successfully activated, false otherwise
     */
    boolean activateAlarm();

    /**
     * Deactivates the alarm.
     */
    void deactivateAlarm();
}