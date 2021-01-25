package com.example.helloserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/server")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){

        return "Hello Eureka Server";
    }
}
