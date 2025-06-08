package com.service1.service1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("service1/api/")
@RestController
public class MyController {
    @Autowired
    private KafkaConsumerService kafkaConsumerService;

    @GetMapping("test")
    public String hello() {
        return "Hello from Service 1!  ";
    }

}
