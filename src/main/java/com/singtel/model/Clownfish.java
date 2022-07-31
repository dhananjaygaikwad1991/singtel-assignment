package com.singtel.model;

import com.singtel.service.BirdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Clownfish implements Fish {
    Logger logger = LoggerFactory.getLogger(Clownfish.class);

    @Override
    public boolean fly() {

        logger.info("Cannot fly");
        return false;
    }

    @Override
    public boolean sing() {
        logger.info("Cannot sing");
        return false;

    }

    @Override
    public boolean walk() {
        logger.info("Cannot walk");
        return false;

    }

    @Override
    public boolean swim() {
        logger.info("I can swim");
        return true;

    }

    @Override
    public void size() {
        logger.info("I am small");

    }

    @Override
    public void colour() {
        logger.info("I am orange in colour");
    }

    @Override
    public boolean eat() {
        logger.info("I don't eat other fish");
        return false;

    }

    @Override
    public boolean makeJokes() {
        logger.info("I make Jokes");
        return true;

    }

}
