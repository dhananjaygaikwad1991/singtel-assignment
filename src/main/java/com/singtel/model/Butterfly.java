package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Butterfly implements Animal {
    Logger logger = LoggerFactory.getLogger(Butterfly.class);
    boolean isCaterpiller;

    public boolean isCaterpiller() {
        return isCaterpiller;
    }

    public void setCaterpiller(boolean caterpiller) {
        isCaterpiller = caterpiller;
    }

    @Override
    public boolean sing() {
        logger.info("I cannot sing");
        return false;

    }

    @Override
    public boolean walk() {
        if (isCaterpiller) {
            logger.info("I can walk/crawl");
            return true;
        } else {
            logger.info("I cannot walk");
            return false;
        }

    }

    @Override
    public boolean fly() {

        if (isCaterpiller) {
            logger.info("I cannot fly ");
            return false;
        } else {
            logger.info("I can fly");
            return true;
        }

    }

    @Override
    public boolean swim() {
        logger.info("I cannot swim");
        return false;
    }
}
