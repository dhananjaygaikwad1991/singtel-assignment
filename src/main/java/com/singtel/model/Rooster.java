package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
    Logger logger = LoggerFactory.getLogger(Rooster.class);
    @Autowired
    Map<String, String> languages;

    public boolean fly() {
         logger.info("Cannot fly");
        return false;
    }

    public boolean sing(String language) {

        if (null == language || language.isEmpty()) {
             logger.info("Cock-a-doodle-doo");
        } else {
             logger.info(languages.get(language));
        }
        return true;
    }
}
