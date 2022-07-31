package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;

public class Parrot extends Bird {
    Logger logger = LoggerFactory.getLogger(Parrot.class);
    Animal animal = null;
    Phone phone = null;

    public void livingWith(Animal animal) {
        logger.info("Living with {}", animal.getClass().getSimpleName());
        this.animal = animal;

    }

    public void nearWith(Phone phone) {
        logger.info("Near phone ringing");
        this.phone = phone;

    }

    public boolean fly() {
        logger.info("I am flying");
        return true;
    }

    public boolean sing() {
        if (null == animal) {
            this.livingWith(new Duck());
        }
        if (null == phone) {
            this.nearWith(new Phone());
        }
        animal.sing();
        return true;
    }

    @Override
    public boolean walk() {

        logger.info("I am walking");

        return true;
    }
}
