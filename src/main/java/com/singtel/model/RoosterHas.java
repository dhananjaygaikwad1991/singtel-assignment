package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoosterHas {
    Logger logger = LoggerFactory.getLogger(RoosterHas.class);
    Chicken chicken = new Chicken();

    public void fly() {
        chicken.fly();

    }

    public void sing() {

        logger.info("Cock-a-doodle-doo");
    }

    public void walk() {
        chicken.walk();
    }
}
