/**
 * The Wordle interface
 * @author Ariana Adame
 */
 
interface Wordle {
    // Returns current word
    // @return the current word
    String getWord();
    
    // Returns the user's current answer
    // @return the current answer
    String getAnswer();
    
    // Sets the word to a new word
    // @param newWord the new word to replace the current word
    void setWord(String newWord);
    
    // Sets the answer to a new answer
    // @param newAnswer the new answer to replace the current answer
    void setAnswer(String newAnswer);
    
    // Generates and returns a new word
    // @return newWord the newly-generated word
    String generateWord();

    // Compares the user's answer to the actual word and tells the user the letters that are wrong,
    // right, and right but in the wrong place
    // @param ans the user's answer
    // @param word the actual word
    void checkAnswer(String ans, String word);

    // Starts a new turn
    void newTurn();

    // Ends the game
    // @param win whether or not the user won
    void endGame(boolean win);
    }

