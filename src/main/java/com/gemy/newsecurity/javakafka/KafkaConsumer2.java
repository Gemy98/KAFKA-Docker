package com.gemy.newsecurity.javakafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer2 {


    @KafkaListener(topics = "User", groupId = "group2")
    public void listen(String message) {
        System.out.println("Received Message: from Consumer 2 " + message);
    }



}
