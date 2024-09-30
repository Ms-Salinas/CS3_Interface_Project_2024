import java.util.Random;

public class Dad implements Funny{

    
private String[] jokes={
    "Why don't scientists trust atoms? Because they make up everything.",
  "How do you make a tissue dance? Put a little boogey in it!",
  "How did the barber win the race? He knew a shortcut!", "How does a tree get into their computer? They log in!"
    };//array of jokes

private Random random=new Random();


public String[] getJokes(){
    return jokes;
}


public String ranGenerator(){
    return jokes[random.nextInt(jokes.length)];
}

public String tellNameJoke(String name){
    return "Are you hungry? " + "Yes I am hungry. " + " Nice to meet you hungry, but where is  " + name + ".";
}
}





