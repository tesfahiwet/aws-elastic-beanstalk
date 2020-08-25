package com.awselasticbeanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }

    @GetMapping
    public String hello2() {
        return "Hello tesfahiwet";
    }
}
