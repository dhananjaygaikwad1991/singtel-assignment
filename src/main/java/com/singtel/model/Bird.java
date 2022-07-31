package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird implements Animal {
    Logger logger = LoggerFactory.getLogger(Bird.class);
    public boolean fly() {
         logger.info("I can fly");
        return true;
    }
    public boolean sing() {
         logger.info("I can sing");
        return true;
    }

    @Override
    public boolean walk() {
         logger.info("I can walk");
        return true;

    }

    @Override
    public boolean swim() {
         logger.info("I cannot swim");
        return false;
    }
}
