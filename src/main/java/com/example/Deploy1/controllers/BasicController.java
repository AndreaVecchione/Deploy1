package com.example.Deploy1.controllers;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es")
public class BasicController {
    @Autowired
    private Environment environment;

    @GetMapping("/name")
    public String name() {
        String devName = environment.getProperty("myCostomVarTree.devName");
        return devName;
    }
}
