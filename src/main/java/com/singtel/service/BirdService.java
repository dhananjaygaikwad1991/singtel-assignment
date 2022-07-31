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
        logger.info("******** Parrot with Dog *******");
        Parrot parrotWithDog = new Parrot();
        parrotWithDog.livingWith(new Dog());
        parrotWithDog.walk();
        parrotWithDog.fly();
        parrotWithDog.sing();
        parrotWithDog.sing();

        logger.info("******** Parrot near Phone *******");
        Parrot parrotNearPhone = new Parrot();
        parrotNearPhone.nearWith(new Phone());
        parrotNearPhone.walk();
        parrotNearPhone.fly();
        parrotNearPhone.sing();
        parrotNearPhone.sing();


        logger.info("******** Parrot with Cat *******");
        Parrot parrotWithCat = new Parrot();
        parrotWithCat.livingWith(new Cat());
        parrotWithCat.walk();
        parrotWithCat.fly();
        parrotWithCat.sing();
        logger.info("******** Parrot with Rooster *******");
        Parrot parrotWithRooster = new Parrot();
        parrotWithRooster.livingWith(new Rooster());
        parrotWithRooster.walk();
        parrotWithRooster.fly();
        parrotWithRooster.sing();

        logger.info("******** Parrot with Duck *******");
        Parrot parrotWithDuck = new Parrot();
        parrotWithDuck.livingWith(new Duck());
        parrotWithDuck.walk();
        parrotWithDuck.fly();
        parrotWithDuck.sing();

        logger.info("******** Fish Shark *******");
        Fish sharkFish = new Shark();
        sharkFish.swim();
        sharkFish.fly();
        sharkFish.sing();
        sharkFish.eat();

        logger.info("******** Fish Clownfish *******");

        Fish clownfish = new Clownfish();
        clownfish.swim();
        clownfish.fly();
        clownfish.sing();
        clownfish.makeJokes();
        clownfish.eat();

        logger.info("******** ButterFly/ not Caterpiller*******");

        Butterfly butterfly = new Butterfly();
        butterfly.setCaterpiller(false);
        butterfly.fly();
        butterfly.isCaterpiller();
        butterfly.fly();

        logger.info("******** ButterFly/ Caterpiller*******");

        Butterfly butterflyCaterPiller = new Butterfly();
        butterflyCaterPiller.setCaterpiller(true);
        butterflyCaterPiller.fly();
        butterflyCaterPiller.isCaterpiller();
        butterflyCaterPiller.fly();

    }

}
