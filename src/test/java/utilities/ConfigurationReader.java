package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties prop = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("Configuration.properties");
            prop.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println(" Input stream didn't work");
        }
    }
    public static String getProperty(String keyword){
        return prop.getProperty(keyword);
    }
}
