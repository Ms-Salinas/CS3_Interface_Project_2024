/**
 This class will generate passwords for an animal lover do its more personal to them
 Also add the instance variable pass
 @ author Jailyn Perales
*/
public class AnimalLovers implements PasswordGenerator{
    
    private String pass;
    
    public AnimalLovers(){
        pass = "";
    }
    /**
     This generatePassword() method will randomly generate a password 
     for the user and return the generated password.
    */
    public String generatePassword(){
        String[] sayings = {"ILove", "IAmA", "MyFav", "IAdore", "Sassy","Excellent", "Fabulous"};
        int rand = (int)((Math.random()* 6));
        String[] animals = {"Koala", "Dog", "Cat", "Dolphin", "Shark","Elephant", "Monkey"};
        pass += sayings[rand];
        int rand2 = (int)((Math.random()* 6));
        pass += animals[rand2];
        pass += rand;
        
        return pass;
        
    }
    
    
    /**
     This getPasswordLength() method will return the length of the password as an integer.
    */
    public int getPasswordLength(){
        return pass.length();
    }
    
    
    /**
     This setPasswordLength() method will add or take away characters
     from the password to make it the desired length.
    */
    public void setPasswordLength(int length){
        
        while(pass.length() < length){
            int rand3 = (int)((Math.random()* 9));
            pass += rand3;
            System.out.println(pass.length());
        }
        
        
    }
    
    
    /**
     This specialCharacters() method will ADD a special character if the 
     parameter is true and TAKE OUT the special characters (if any) if the parameter is false
    */
    public void specialCharacters(boolean include){
        if(include == true){
            String[] special = {"!", "@", "?", "&", "$","%", "*"};
            int rand4 = (int)((Math.random()* 6));
            pass += special[rand4];
        }
    }
    
    
    /**
     This hasSpecialCharacters() method will return true if the password 
     has special characters and false if the password does not have any special characters
    */
    public boolean hasSpecialCharacters(){
        String[] special = {"!", "@", "?", "&", "$","%", "*"};
        for(int i = 0 ; i < special.length;i++){
            if(pass.indexOf(special[i]) > -1){
                return true;
            }
        }
        return false;
        
    }
    /**
    This getPassword() method will return the current generated password
    */
    public String getPassword(){
        return pass;
    }
}




