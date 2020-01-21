import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void isPasswordValid() {
        PasswordChecker input = new PasswordChecker();

        boolean isValid = input.isPasswordValid("e#$%#$%#RTERT34534534wer");
        assert(isValid);

        boolean isValid2 = input.isPasswordValid("T42rr423@@#");
        assert(isValid2);

        boolean isValid3 = input.isPasswordValid("tLOUuuu55%u^^^^");
        assert(isValid3);

        boolean isValid4 = input.isPasswordValid("5555%%%rtYY555555555");
        assert(isValid4);

        boolean isValid5 = input.isPasswordValid("$$9331Tlou5");
        assert(isValid5);

        boolean isValid6 = input.isPasswordValid("*Tlou               34534*");
        assert(isValid6);
    }

    @Test
    void passwordIsOk() {
        PasswordChecker input = new PasswordChecker();
        boolean isValid = input.passwordIsOk("Tlou234234");
        assert(isValid);

        boolean isValid2 = input.passwordIsOk("2342423@#$@#$@#");
        assert(isValid2);

        boolean isValid3 = input.passwordIsOk("TLOUUUUUU");
        assert(isValid3);

        boolean isValid4 = input.passwordIsOk("5555555555555555");
        assert(isValid4);

        boolean isValid5 = input.passwordIsOk("Tlou9331115");
        assert(isValid5);

        boolean isValid6 = input.passwordIsOk("*               *");
        assert(isValid6);
    }


}
