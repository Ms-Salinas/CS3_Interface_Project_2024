import java.util.Random;

public class KnockKnock implements Funny{

    
private String[] jokes={
    "knock knock. who's there? Atch. Atch who? Sorry, I didn`t know you had a cold.",
  "Knock knock. Who's there? Amos Amos who? A mosquito",
  "Knock, knock Who's there? Who. Who who? Are you an owl?", 
  "Knock, knock Who's there? Lettuce. Lettuce who? Lettuce in, it's cold out here."
    };//array of jokes

private Random random=new Random();


public String[] getJokes(){
    return jokes;
}


public String ranGenerator(){
    return jokes[random.nextInt(jokes.length)];
}

public String tellNameJoke(String name){
    return "Knock, knock. Who's there? " + name +". " + name + " who? " + name + " one who's always late";
}
}



