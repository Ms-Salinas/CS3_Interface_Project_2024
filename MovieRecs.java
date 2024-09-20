/*Interface containing methods that will return a list of movies off of the object the user creates (Action, Comedy, or Thriller), and the age rating and review the user prefers 
    @author Kenedi Carson*/
interface MovieRecs {
    String[] movies = new ArrrayList<String>(); //Example: {"Avengers", "PG-13", "8", "The Matrix", "R", "9"}
    String age = " "; //Age rating of a movie, written as "PG-age"
    String review = " "; //Rating of a movie, written as "number"
    
    String[] findMovie(int age, String rating); //Traverses the arrayList of movies to find a movie that fits the criteria, deletes any that does not, and returns the list 
    
    String getName(); //Returns the name of the movie (used when comparing movie names/ if user asks for just the name)
    
    String getRating(); //Returns the age rating the moive(used when comparing age ratings/ if user asks for just the rating)
    
    String getReview(); //Returns the review score of the movie (used when comparing reviews/ if user asks for just the review) (ex: 7)
    
    void removeScores(int score); //Remove any movies that have a review of less than the value given from the arrayList, used if a user just wants to filter by rating
    
    void removeRatings(); //Remove any movies that have an age rating that is too high for the instance variable age from the arrayList, used if a user just wants to filter by age
    
    void noMatch(); //Returns a message stating that no match could be found given the parameters (Meaning the list is empty)
    
    
    
    
    
}