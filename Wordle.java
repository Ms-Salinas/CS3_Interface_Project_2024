/**
The Wordle interface
@author Ariana Adame
*/

interface Wordle {
    // Returns current word
    // @return        the current word
    abstract String getWord();
    
    // Returns the user's current answer
    // @return        Returns current answer
    abstract String getAnswer();
    
    // Sets the word to a new word
    // @param newWord        the new word to replace the current word
    abstract void setWord(String newWord);
    
    
    // Sets the answer to a new answer
    // @param newAnswer        the new answer to replace the current answer
    abstract void setAnswer(String newAnswer);
    
    // Generates and returns a new word
    // @return newWord        the newly-generated word
    abstract String generateWord();

    // Compares the user's answer to the actual word and tells the user the letters that are wrong, right, and right but
    // in the wrong place
    // @param ans        the user's answer
    // @param word        the actual word
    abstract void checkAnswer(String ans, String word);

    // Starts a new turn
    abstract void newTurn();

    // Ends the game
    // @param        whether or not the user won
    abstract void endGame(boolean win);
}
