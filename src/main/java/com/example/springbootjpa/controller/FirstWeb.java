package com.example.springbootjpa.controller;

import com.example.springbootjpa.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWeb {

    @Autowired
    TestConfig testConfig;

    @GetMapping("/hello")
    public String app1() {
        return "hello Application 1";
    }

    @RequestMapping("/testConfig")
    public String test() {
        return testConfig.getServers().get(0) + ", " + testConfig.getServers().get(1);
    }

}
