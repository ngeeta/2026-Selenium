package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties;

    static {
        try (FileInputStream fis = new FileInputStream("resources/config.properties")) {
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  String get(String key) {
    	System.out.println("Key "+key);
        return properties.getProperty(key);
    }

}
