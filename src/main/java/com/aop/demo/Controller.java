package com.aop.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("Calling from controller");
        return "hello from service";
    }
}
