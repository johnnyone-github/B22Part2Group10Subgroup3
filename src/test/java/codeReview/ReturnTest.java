package codeReview;


import utilities.ConfigurationReader2;

public class ReturnTest {
    public static void main(String[] args) {

        String browser = ConfigurationReader2.pullKeyword("browser");
        System.out.println(browser);
    }
}
