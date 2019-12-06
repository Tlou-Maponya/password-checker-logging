
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker{
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public  boolean isPasswordValid(String password){

        if(password.length() > 8 && password != null)
        {
            /* Pattern Class
                compiles the given regex and returns the instance of the Pattern.
            */
            Pattern lowerCase = Pattern.compile("[a-z]");                           //  a through z or A through Z, inclusive (range)
            Pattern upperCase = Pattern.compile("[A-Z]");
            Pattern digit = Pattern.compile("[0-9]");                                   //  Any digits, short of [0-9]  alternative ("/d")
            Pattern specialChar = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");     //

            /* Matcher Class
               creates a matcher that matches the given input with the pattern.
            */
            Matcher lowerExists = lowerCase.matcher(password);
            Matcher upperExists = upperCase.matcher(password);
            Matcher digitExists = digit.matcher(password);
            Matcher specialCharExists = specialChar.matcher(password);

            // if statement not working as should

            // Program not displaying relevant error message
//            if(!lowerExists.find()){
//                System.out.println("Please enter a lower case");
//            }
//
//            if(!upperExists.find()){
//                System.out.println("Please enter an Upper case");
//            }
//
//            if(!digitExists.find()){
//                System.out.println("Please enter a digit");
//            }
//
//            if(!specialCharExists.find()){
//                System.out.println("Please enter a special character");
//            }

            return lowerExists.find() && upperExists.find() && digitExists.find() && specialCharExists.find();

        }
        else {

            logger.error("Please enter 8 characters or more");
            return false;
        }
    }
}