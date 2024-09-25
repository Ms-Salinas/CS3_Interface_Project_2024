//CS3_Interface_Project_2024
// No comments or UML was provided by desiner
// Sub class was not provided by desiner
// Added getPassword() method

public interface PasswordGenerator {
    /**
     This generatePassword() method will randomly generate a password for the user.
    */
    String generatePassword();
    
    
    /**
     This getPasswordLength() method will return the length of the password as an integer.
    */
    int getPasswordLength();
    
    
    /**
     This setPasswordLength() method will add or take away characters
     from the password to make it the desired length.
    */
    void setPasswordLength(int length);
    
    
    /**
     This specialCharacters() method will ADD a special character if the 
     parameter is true and TAKE OUT the special characters (if any) if the parameter is false
    */
    void specialCharacters(boolean include);
    
    
    /**
     This hasSpecialCharacters() method will return true if the password 
     has special characters and false if the password does not have any special characters
    */
    boolean hasSpecialCharacters();
    
    
    /**
    This getPassword() method will return the current generated password
    */
    String getPassword();

}

//2 non void methods
//2 methods that have parameters
//Minium 5 methods total


