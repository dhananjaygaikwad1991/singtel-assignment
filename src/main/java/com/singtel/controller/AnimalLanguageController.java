package com.singtel.controller;

import com.singtel.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AnimalLanguageController {
    @Autowired
    BirdService birdService;

    @GetMapping("/animal")
    public Map<String, String> getRoosterSoundByLanguage(@RequestParam("name") String animalName, @RequestParam("language") String language) {
        if (!animalName.isEmpty() && animalName.equalsIgnoreCase("rooster")) {
            return birdService.getRoosterLanguageSound(language);
        } else {
            throw new RuntimeException("Animal not found");
        }
    }
}
