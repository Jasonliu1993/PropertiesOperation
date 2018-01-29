package com.properties.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
public class Config {


    @Bean(name = "headerProperties")
    public Properties configHeaderProperties() {

        Properties header = new Properties();

        try (InputStream headerInputStream = new FileInputStream(new File("/Users/Jason/Desktop/headerProperties.properties"));
        ) {

            header.load(headerInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return header;

    }

    @Bean(name = "dataProperties")
    public Properties configDataProperties() {

        Properties data = new Properties();

        try (InputStream dataInputStream = new FileInputStream(new File("/Users/Jason/Desktop/dataProperties.properties"));
        ) {

            data.load(dataInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }

    @Bean(name = "targetProperties")
    public Properties configTargetProperties() {

        Properties target = new Properties();

        try (
             InputStream targetInputStream = new FileInputStream(new File("/Users/Jason/Desktop/targetProperties.properties"))
        ) {

            target.load(targetInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return target;

    }

}
