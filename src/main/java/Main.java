import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {



        logger.info("Please enter name");
        Scanner input2 = new Scanner(System.in);
        String name = input2.nextLine();

        //input password from user
        logger.info("Please enter password");
        logger.info("(Password should be between greater than 8 characters and should consist of atleast 1 Special character, 1 uppercase, 1 lowercase and a number) ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        PasswordChecker test = new PasswordChecker();
        boolean myPass = test.isPasswordValid(password);

        System.out.println(myPass);
        //System.out.println(password);


    }
}
