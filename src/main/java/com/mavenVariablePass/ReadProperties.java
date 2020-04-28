package com.mavenVariablePass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ReadProperties {

    public static void main (String agrs[]) throws IOException {


        ReadProperties app = new ReadProperties();
        Properties prop = app.loadPropertiesFile("config.properties");
        prop.forEach((k, v) -> System.out.println(k + ":" + v));

    }

    public Properties loadPropertiesFile(String filePath) throws IOException {

        Properties prop = new Properties();

        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filePath)) {
            prop.load(resourceAsStream);

        }

        return prop;

    }


}
