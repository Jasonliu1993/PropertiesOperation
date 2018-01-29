package com.properties.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class CSVOperation implements CommandLineRunner {

    @Qualifier("headerProperties")
    @Autowired
    private Properties headerProperties;

    @Qualifier("dataProperties")
    @Autowired
    private Properties dataProperties;

    @Qualifier("targetProperties")
    @Autowired
    private Properties targetProperties;

    @Override
    public void run(String... args) throws Exception {

        for (Object key : headerProperties.keySet()) {



            System.out.println(headerProperties.getProperty((String) key));
        }
        System.out.println(dataProperties);
        System.out.println(targetProperties);

    }
}
