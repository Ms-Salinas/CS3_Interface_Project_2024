/**
This interface is a design or skeleton for the code to develop a game recomendation for the user
@author Ta'Rissa Woods
@ version %I% %G%
*/
interface VideoGameRec{
    /**
  Abstract method to have the age range (like a set method), will be implimented later
  @param an integer about 0 which will be more of a this age and up type of parameter instead of a range
  */
    void ageRange(int age);
    /**
  Abstract method to have a game genre (like a set method), will be implimented later
  @param a string for the genre type wanted for the game recomendation
  */
    void gameGenre(String genre);
    /**
  Abstract method to have a game narrative (like a set method), will be implimented later
  @param a string for the narrative type wanted for the game recomendation
  */
    void narrativeType(String type);
    /**
  Abstract method to return/get the age, will be implimented later
  @return a integer that was set from the ageRange() method
  */
    int getAge();
    /**
  Abstract method to return/get the game genre, will be implimented later
  @return a string that was set from the gameGenre() method
  */
    String getGameGenre();
    /**
  Abstract method to return/get the narrative type, will be implimented later
  @returnb a string that was set from the narrativeType() method
  */
    String getNarrativeType();
}

