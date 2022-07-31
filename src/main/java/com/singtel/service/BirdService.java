package com.singtel.service;


import com.singtel.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Bird());
        animals.add(new Duck());
        animals.add(new Chicken());
        animals.add(new Rooster());
        animals.add(new Parrot());
        animals.add(new Shark());
        animals.add(new Clownfish());
        animals.add(new Dog());
        animals.add(new Butterfly());
        animals.add(new Cat());

        Map<Object, Map<Object, List<Animal>>> animalsFlies = animals.stream().collect(Collectors.groupingBy(animal -> animal.fly(), Collectors.groupingBy(animal -> animal)));
        Map<Object, Map<Object, List<Animal>>> animalsWalks = animals.stream().collect(Collectors.groupingBy(animal -> animal.walk(), Collectors.groupingBy(animal -> animal)));
        Map<Object, Map<Object, List<Animal>>> animalsSings = animals.stream().collect(Collectors.groupingBy(animal -> animal.sing(), Collectors.groupingBy(animal -> animal)));
        Map<Object, Map<Object, List<Animal>>> animalsSwims = animals.stream().collect(Collectors.groupingBy(animal -> animal.swim(), Collectors.groupingBy(animal -> animal)));


        logger.info("********* Animals that can fly: {}, and cannot fly: {} ", animalsFlies.get(true).size(), animalsFlies.get(false).size());
        logger.info("********* Animals that can walk: : {}, and cannot walk: {} ", animalsWalks.get(true).size(), animalsWalks.get(false).size());
        logger.info("********* Animals that can sing: : {}, and cannot wing: {}", animalsSings.get(true).size(), animalsSings.get(false).size());
        logger.info("********* Animals that can swim: : {}, and cannot swim: {}", animalsSwims.get(true).size(), animalsSwims.get(false).size());


    }

}
