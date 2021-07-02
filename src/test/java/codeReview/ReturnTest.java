package codeReview;


import utilities.ConfigurationReader;

public class ReturnTest {
    public static void main(String[] args) {

        String browser = ConfigurationReader.getProperty("browser");
        System.out.println(browser);
    }
}
