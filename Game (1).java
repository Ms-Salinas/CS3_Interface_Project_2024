class Game implements VideoGameRec{
//Get variables    
    private int age;
    private String genre;
    private String narrativeType;
 //Set ageRange   
    public void ageRange(int age){
        this.age=age;
    }
//Set gameGenre
    public void gameGenre(String genre){
       this.genre=genre;
    }
//Sets narrativeType
     public void narrativeType(String type){
        this.narrativeType=type;
     }
//Calls age     
     public int getAge(){
         return age;
     }
//Calls genre
     public String getGameGenre(){
         return genre;
     }
//Calls narrativeType
     public String getNarrativeType(){
         return narrativeType;
     }
}