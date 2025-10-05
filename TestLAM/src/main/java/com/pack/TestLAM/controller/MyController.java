package com.pack.TestLAM.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.TestLAM.service.MyService;

@RestController
public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

   
    @GetMapping("/get/{t1}")
    public String greet(@PathVariable("t1") String name) {
        logger.debug("/ endpoint called with name={}", name);
        String message = "welcome"+ " "+service.getLogin(name);
        logger.info(" message generated: {}", message);
        return message;
    }
}
