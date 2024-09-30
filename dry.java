import java.util.Random;

public class Dry implements Funny{

    
private String[] jokes={
    "Did you hear about the invisible man who went to the doctor? He’s still waiting to be seen.",
  "Why don't zombies eat clowns? Because they taste funny.",
  "My boss told me to have a good day. So, I didn’t go to work.", "Why do cemeteries have fences? Because everyone's dying to get in."
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




