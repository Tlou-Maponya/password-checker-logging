import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
   final static Logger mainLogger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        //input password from user
        Scanner input = new Scanner(System.in);
        PasswordChecker test = new PasswordChecker();
        String password = "";
        mainLogger.info("Please enter your password: ");
        mainLogger.info("Password should be between greater than 8 characters");
        mainLogger.info("and should consist of at least 1 Special character, 1 uppercase, 1 lowercase and a number: \n");
        password = input.nextLine();
        try {
            test.isPasswordValid(password);
            mainLogger.debug("passwordIsOk returns: " + test.passwordIsOk(password));
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }


    }

}
