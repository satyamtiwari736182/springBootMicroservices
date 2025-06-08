package com.service.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SERVICE1")
public interface Service1 {
    @RequestMapping(method = RequestMethod.GET, value = "/service1/api/test")
    String helloService1();
}
