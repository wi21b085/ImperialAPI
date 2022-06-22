package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ImperialAPIController {

    ImperialAPI api = new ImperialAPI();

    @RequestMapping("/centimeter")
    public double cm(@RequestParam double inch){
        return api.cm(inch);
    }

    @RequestMapping("/meter")
    public double m(@RequestParam double yard){
        return api.m(yard);
    }
}
