package com.singtel.service;


import com.singtel.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BirdService {
    Logger logger = LoggerFactory.getLogger(BirdService.class);

    public void testBird() {
        logger.info("******** Duck *******");
        Animal duck = new Duck();
        duck.walk();
        duck.fly();
        duck.sing();
        logger.info("******** Rooster *******");
        Animal rooster = new Rooster();
        rooster.walk();
        rooster.fly();
        rooster.sing();
        logger.info("******** RoosterHas *******");
        RoosterHas roosterHas = new RoosterHas();
        roosterHas.walk();
        roosterHas.fly();
        roosterHas.sing();

    }

}
