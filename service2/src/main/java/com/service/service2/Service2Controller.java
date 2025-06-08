package com.service.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/service2/api/")
@RestController
public class Service2Controller {
    @Autowired
    private KafkaProducerService producerService;
    static int count = 0;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RestClient restClient;

    @RequestMapping("/test")
    public String hello() {
        producerService.sendMessage("service2-topic", "Hello from Service 2! " +
                count);
        count++;

        var res = restTemplate.getForObject("http://SERVICE1/service1/api/test",
                String.class);
        // var res = restClient.get()
        // .uri("http://SERVICE1/service1/api/test")
        // .retrieve()
        // .body(String.class);

        System.out.println("Response from Service 1:\n " + res);

        return "Hello from Service 2!";
    }
}
