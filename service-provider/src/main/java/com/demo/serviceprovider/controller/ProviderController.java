package com.demo.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ProviderController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }


}
