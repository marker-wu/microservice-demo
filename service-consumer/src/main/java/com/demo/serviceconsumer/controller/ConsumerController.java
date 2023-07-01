package com.demo.serviceconsumer.controller;

import com.demo.serviceapi.ProviderApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class ConsumerController {

    @Resource
    private ProviderApi providerApi;

    @RequestMapping("/say")
    public String sayHello(){
        return providerApi.sayHello();
    }
}
