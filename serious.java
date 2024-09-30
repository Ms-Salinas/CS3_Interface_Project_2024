import java.util.Random;

public class Serious implements Funny{

    
private String[] jokes={
    "What do lawyers wear under their pants? Briefs.",
  "Why did the invisible man quit his job? He couldn't see himself doing it.",
  "Why shouldn't you trust trees? They can be a little shady.",
  "What do you call a crocodile that's always causing trouble? An insta-gator."
    };//array of jokes

private Random random=new Random();


public String[] getJokes(){
    return jokes;
}


public String ranGenerator(){
    return jokes[random.nextInt(jokes.length)];
}

public String tellNameJoke(String name){
    return "N/A";
}
}





