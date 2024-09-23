/**
  This class is used to show a tour around a virtual museum contains the visitors information as well as the
  times the museum is open.
  @author Giovani Zuniga
*/
interface VMT {
  int[] dates = [];
  abstract String ScheduleIRLTour(String time,); // Schedule a tour to the real facility, gives you a date you'll come in and your verification ticket.
  abstract String askQuestion(String question); // Ask a question regarding the artwork, there's a certain selection of questions you can ask.
  abstract void getDates(); // Gives the dates which the tour is available.
  abstract void getTimes(); // Gives the times which the tour is available.
  abstract void getInfoOnArtifact(); // Gives information about the art
  abstract void startTour(); // Starts the virtual tour.
  abstract void endTour(); // Ends the virtual tour.
}
