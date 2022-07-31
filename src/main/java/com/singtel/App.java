package com.singtel;


import com.singtel.service.BirdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Main Application
 */
@EnableAutoConfiguration
@SpringBootApplication
public class App {
    Logger logger = LoggerFactory.getLogger(App.class);
    @Autowired
    BirdService birdService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init() {
        birdService.testBird();
    }

}
