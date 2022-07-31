package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dolphin implements Animal {
    Logger logger = LoggerFactory.getLogger(Dolphin.class);
    Fish fish;

    void hasFishBehaviour(Fish fish) {
        this.fish = fish;
    }

    @Override
    public boolean fly() {

        fish.fly();
        return fish.fly();
    }

    @Override
    public boolean sing() {
        fish.sing();
        return false;
    }

    @Override
    public boolean walk() {
        fish.walk();
        return false;
    }

    public boolean swim() {
        fish.swim();
        return true;
    }

}
