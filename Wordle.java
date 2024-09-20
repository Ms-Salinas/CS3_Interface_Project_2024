/**
The Wordle interface
@author Ariana Adame
*/

interface Wordle {
    abstract String getWord();
    abstract String getAnswer();
    abstract void setWord(String newWord);
    abstract void setAnswer(String newAnswer);
    abstract String generateWord();
    abstract boolean checkAnswer(String word);
    abstract void newTurn();
    abstract void endGame(boolean win);
}
