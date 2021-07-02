package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Login {
    public static void vyTrackLogin () {
        Driver.getDriver().get(ConfigurationReader.getProperty("vtrackUrl"));

        String username = ConfigurationReader.getProperty("vtrackUsername");
        String password = ConfigurationReader.getProperty("vtrackPassword");

        //login using the strings
        WebElement usernameField = Driver.getDriver().findElement(By.xpath("//input[@name='_username']"));
        usernameField.sendKeys(username);

        WebElement passwordField = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        passwordField.sendKeys(password + Keys.ENTER);
        Driver.getDriver().navigate().refresh();
    }
}
