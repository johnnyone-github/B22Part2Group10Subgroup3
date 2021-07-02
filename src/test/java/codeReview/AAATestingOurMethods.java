package codeReview;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Login;

public class AAATestingOurMethods {

    @Test
    public void how_to_use_driver() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @Test
    public void vytrakLoging() {
        Login.vyTrackLogin();
    }

    @Test
    public void placeToTestMethods() {
   //    NumbersOddAndEven.OddOrEven(17);

        NumbersOddAndEven.divideNum(10, 15);
    }

}
