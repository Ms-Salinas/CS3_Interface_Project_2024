import java.util.Scanner;

/**
 * Main method allows user to create multiple schedules, Calendar and Sports schedules.
 * The user can add events to each schedule that will remain there.
 * @author Joshua Vento-Jones
 **/
public class Main {
    public static void main(String[] args) {

        // Scanner scanA takes in String inputs while scanB takes in int inputs.
        Scanner scanA = new Scanner(System.in);
        Scanner scanB = new Scanner(System.in);

        // Creates a CalendarSchedule and SportsSchedule object to be modified
        CalendarSchedule calendar = new CalendarSchedule();
        SportsSchedule sport = new SportsSchedule();

        // Continuous input variable to traverse menu
        String selection = "";
        
        // Will continue to run menu until user selects 4, to exit the program.
        while(!selection.equals("6")){
            System.out.println("Please select the schedule you would like to edit:\n1) Calendar Schedule\n2) Sports Schedule\n3) View a schedule\n4) Check reminders\n5) Check most recent event\n6) Quit the program");
            selection = scanA.nextLine();

            // Runs through calendar schedule, adding to the calendar object again and again
            // Until user selects 2 to stop.
            if(selection.equals("1")){
                boolean stopper = false;
                while(!stopper){
                    System.out.println("Print the name for this event: ");
                    String name = scanA.nextLine();
                    System.out.println("Now print the date (Should be a number from 1-365)");
                    int dayOf = scanB.nextInt();
                    calendar.setEvent(name, dayOf);
                    System.out.println("Current schedule: \n" + calendar.getEvent());
                    System.out.println("Would you like to add another event to the Calendar Schedule?\n1) Yes\n2) No");
                    if(scanA.nextLine().equals("2")){
                        stopper = true;
                    }
                }
            }
            // Runs through sports schedule, adding to the sport object again and again
            // Until user selects 2 to stop.
            else if(selection.equals("2")){
                boolean stopper = false;
                while(!stopper){
                    System.out.println("What sport are you scheduling for?");
                    String name = scanA.nextLine();
                    System.out.println("What date is this game on? (Should be a number from 1-365)");
                    int dayOf = scanB.nextInt();
                    sport.setEvent(name, dayOf);
                    System.out.println("Current sport schedule: \n" + sport.getEvent());
                    System.out.println("Would you like to add another event to the Sports Schedule?\n1) Yes\n2) No");
                    if(scanA.nextLine().equals("2")){
                        stopper = true;
                    }
                }
            }

            // Prints both calendar and sport schedule, all events in them.
            else if(selection.equals("3")){
                System.out.println("Current calendar schedule:\n" + calendar.getEvent());
                System.out.println("Current sport schedule:\n" + sport.getEvent());
            }

            // Checks reminders for both the regular and sports calendar based off the day to check from user.
            else if(selection.equals("4")){
                System.out.println("What day do you want to check? (Should be a number from 1-365)");
                int dayOf = scanB.nextInt();
                System.out.println("Regular Calendar:\n" + calendar.reminder(dayOf));
                System.out.println("Sports Calendar:\n" + sport.reminder(dayOf));
            }

            // Checks days since last event based off the day input from the user.
            else if(selection.equals("5")){
                System.out.println("What day do you want to check? (Should be a number from 1-365)");
                int dayOf = scanB.nextInt();
                if(calendar.dayPassed(dayOf)>0){
                    System.out.println("The last calendar event was " + calendar.dayPassed(dayOf) + " days ago");
                }
                else{
                    System.out.println("No calendar events have passed");
                }
                if(sport.dayPassed(dayOf)>0){
                    System.out.println("The last sport event was " + sport.dayPassed(dayOf) + " days ago");
                }
                else{
                    System.out.println("No sport events have passed");
                }
            }

            // Quits the program
            else if(selection.equals("6")){
                System.out.println("Thanks for using the program!");
            }
            
            // Ensures program doesn't undergo error, forcing user to select a valid option.
            else{
                System.out.println("Please choose a valid option...");
            }
        }
    }
}
