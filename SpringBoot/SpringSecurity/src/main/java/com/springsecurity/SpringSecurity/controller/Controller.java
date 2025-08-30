package com.springsecurity.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {
    @GetMapping("m1")
    public String m1()
    {
        return  " This is example for Spring Security";
    }
    @GetMapping("m2")
    public  String m2()
    {
        return " Contact us at adnan21122001@gmail.com";
    }
}
