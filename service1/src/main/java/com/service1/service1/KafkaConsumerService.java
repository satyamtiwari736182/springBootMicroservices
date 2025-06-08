package com.service1.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "service2-topic", groupId = "my-group2")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
