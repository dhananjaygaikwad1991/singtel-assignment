package com.singtel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class LanguageConfig {
    Logger logger = LoggerFactory.getLogger(LanguageConfig.class);

    @Bean
    Map<String, String> languages() {
        logger.info("********* SETUP LANGUAGES *************");
        logger.info("********* SETUP LANGUAGES1 *************");
        logger.info("********* SETUP LANGUAGES2 *************");
        logger.info("********* SETUP LANGUAGES3 *************");
        logger.info("********* SETUP LANGUAGES4 *************");
        logger.info("********* SETUP LANGUAGES5 *************");
        Map<String, String> languages = new HashMap<String, String>();
        languages.put("French", "cocorico");
        languages.put("German", "kikeriki");
        languages.put("Greek", "kikiriki");
        languages.put("Hebrew", "coo-koo-ri-koo");
        languages.put("Hungarian", "kukuriku");
        languages.put("Urdu", "kuklooku");
        languages.put("English", "Cock-a-doodle-doo");
        languages.put("Danish", "kykyliky");
        languages.put("Dutch", "kukeleku");
        languages.put("Finnish", "kukko kiekuu");
        languages.put("Italian", "chicchirichi");
        languages.put("Japanese", "ko-ke-kok-ko-o");
        languages.put("Portuguese", "cucurucu");
        languages.put("Russian", "kukareku");
        languages.put("Swedish", "kuckeliku");
        languages.put("Turkish", "kuk-kurri-kuuu");

        return languages;
    }
}
