package com.epam.utils;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop = new Properties();

    static {

        try {

            String env = System.getProperty("env");

            if(env == null)
                env = "dev";

            FileInputStream fis = new FileInputStream(
                    "src/test/resources/config/" + env + ".properties"
            );

            prop.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        return prop.getProperty("baseUrl");
    }

    public static String getBrowser() {
        return prop.getProperty("browser");
    }

}
