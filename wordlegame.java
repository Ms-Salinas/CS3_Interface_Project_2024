import java.util.Scanner;
import java.util.Random;

public class WordleGame implements Wordle {
    private String word;
    private String answer;
    private int turns = 6;
    private int turnsLeft;

    // Constructor to initialize the game
    public WordleGame() {
        this.turnsLeft = turns;
        this.word = generateWord();
        this.answer = "";
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void setWord(String newWord) {
        this.word = newWord;
    }

    @Override
    public void setAnswer(String newAnswer) {
        this.answer = newAnswer;
    }

    @Override
    public String generateWord() {
        String[] wordList = {"apple", "grape", "lemon", "peach", "berry"};
        Random rand = new Random();
        return wordList[rand.nextInt(wordList.length)];
    }

    @Override
    public void checkAnswer(String ans, String word) {
        StringBuilder feedback = new StringBuilder();

        for (int i = 0; i < ans.length(); i++) {
            char currentChar = ans.charAt(i);
            if (currentChar == word.charAt(i)) {
                feedback.append(currentChar).append(" (correct position) ");
            } else if (word.indexOf(currentChar) != -1) {
                feedback.append(currentChar).append(" (wrong position) ");
            } else {
                feedback.append(currentChar).append(" (not in word) ");
            }
        }
        
        System.out.println(feedback.toString());
    }

    @Override
    public void newTurn() {
        if (turnsLeft > 0) {
            turnsLeft--;
            answer = ""; // Reset answer for the new turn
            System.out.println("New turn started! Turns left: " + turnsLeft);
        } else {
            System.out.println("No turns left!");
        }
    }

    @Override
    public void endGame(boolean win) {
        if (win) {
            System.out.println("Congratulations! You've guessed the word: " + word);
        } else {
            System.out.println("Game over! The correct word was: " + word);
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        WordleGame game = new WordleGame();
        Scanner scanner = new Scanner(System.in);

        while (game.getTurnsLeft() > 0) {
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().toLowerCase();
            game.setAnswer(userGuess);
            game.checkAnswer(userGuess, game.getWord());

            if (userGuess.equals(game.getWord())) {
                game.endGame(true);
                break;
            }

            game.newTurn();
        }

        if (game.getTurnsLeft() == 0) {
            game.endGame(false);
        }

        scanner.close();
    }

    // Getter for turns left (add this method)
    public int getTurnsLeft() {
        return turnsLeft;
    }
}
