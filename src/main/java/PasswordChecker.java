import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker{
    private final static Logger passCheckLogger = LogManager.getLogger(PasswordChecker.class);

    public  boolean isPasswordValid(String password){
        /* Pattern Class
                compiles the given regex and returns the instance of the Pattern.
         */
        Pattern lowerCase = Pattern.compile("[a-z]");                           //  a through z or A through Z, inclusive (range)
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");                                   //  Any digits, short of [0-9]  alternative ("/d")
        Pattern specialChar = Pattern.compile ("[!@,.#$%&*()_+=|<>?{}\\[\\]~-]");     //

            /* Matcher Class
               creates a matcher that matches the given input with the pattern.
            */
        Matcher lowerExists = lowerCase.matcher(password);
        Matcher upperExists = upperCase.matcher(password);
        Matcher digitExists = digit.matcher(password);
        Matcher specialCharExists = specialChar.matcher(password);

        if(password.length() > 8 && password != null)
        {
            // Program should display relevant error message
            if(!lowerExists.find()){
                passCheckLogger.error("Password should have at least one lowercase letter");
            }
              if(!upperExists.find()){
                 passCheckLogger.error("Password should have at least one uppercase letter");
            }
              if(!digitExists.find()){
                 passCheckLogger.error("Password should at least have one digit");
            }
              if(!specialCharExists.find()){
                 passCheckLogger.error("Password should have at least one special character");
            }
            return true;
        }
        else {
            passCheckLogger.error("Password should be longer than than 8 characters");
            return false;
        }

    }

    // Redundancy due to code requirements
    public boolean passwordIsOk(String password) {

        boolean bool = false;
        /* Pattern Class
            compiles the given regex and returns the instance of the Pattern.
        */
        Pattern lowerCase = Pattern.compile("[a-z]");                           //  a through z or A through Z, inclusive (range)
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");                                   //  Any digits, short of [0-9]  alternative ("/d")
        Pattern specialChar = Pattern.compile ("[!@#$%^,./&*()_+=|<>?{}\\[\\]~-]");     //

        /* Matcher Class
            creates a matcher that matches the given input with the pattern.
        */
        Matcher lowerExists = lowerCase.matcher(password);
        Matcher upperExists = upperCase.matcher(password);
        Matcher digitExists = digit.matcher(password);
        Matcher specialCharExists = specialChar.matcher(password);

        if(password.length() > 8 && password != null){
            if(specialCharExists.find() || lowerExists.find() || upperExists.find() || digitExists.find()) {
                bool = true;
                passCheckLogger.debug("User password is ok");
            }
        }
        else {
            passCheckLogger.debug("User password is not ok");
        }
            return bool;

    }
}