package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

    public static Object fetchProperity(String key) throws IOException {
        FileInputStream file = new FileInputStream("./Config/config.properties");
        Properties properity = new Properties();
        properity.load(file);
        return properity.getProperty(key);
    }
}
