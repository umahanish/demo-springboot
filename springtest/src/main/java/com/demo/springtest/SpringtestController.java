package com.demo.springtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringtestController {
    @RequestMapping("/demo")
    public String demo(){
    return "Spring boot Test version 2";
    }  

    
}
