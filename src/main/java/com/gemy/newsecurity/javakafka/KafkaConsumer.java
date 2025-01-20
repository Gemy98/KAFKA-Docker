package com.gemy.newsecurity.javakafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "demo-topic", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
