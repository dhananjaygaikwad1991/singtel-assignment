package com.singtel.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Phone {
    Logger logger = LoggerFactory.getLogger(Phone.class);

    public void ring() {
        logger.info("Phone ringing");

    }
}
