package com.example.helloclient;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello/client")
public class HelloController {

@Autowired
private RestTemplate restTemplate;

@HystrixCommand(fallbackMethod = "fallback")
@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getResponse(){
    String url= "http://hello-server/hello/server/hello";
    //localhost:8002

        return restTemplate.getForObject(url,String.class);
    }

    public String fallback(){
    return "Hystrix Fallback";
    }
}
