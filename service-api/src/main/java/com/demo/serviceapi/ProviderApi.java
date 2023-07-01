package com.demo.serviceapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(value = "service-provider")
public interface ProviderApi {

    @PostMapping(value = "/v1/sayHello")
    String sayHello();


}
