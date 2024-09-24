
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        VideoGameRec red = new Game();
        red.ageRange(14);
        red.gameGenre("Scary");
        red.narrativeType("Open world");
        
        System.out.println("The age range for this game is: " +red.getAge());
        System.out.println("The game genre for this game is: " + red.getGameGenre());
        System.out.println("This game narrative type is: "+ red.getNarrativeType());
    }
}
