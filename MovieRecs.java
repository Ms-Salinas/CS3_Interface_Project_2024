/*Interface containing methods to implement later
    @author Kenedi Carson*/
interface MovieRecs {
    String[] movies = new ArrrayList<String>();
    String getName(); //Returns the name of the movie
    
    String getRating(); //Returns the rating of the movie
    
    String getReview(); //Returns a review score of the movie out of 10 (ex: 7/10)
    
    void noMatch(); //Returns a message stating that no match could be found given the parameters
    
    
    
    
    
}