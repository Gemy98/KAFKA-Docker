package com.gemy.newsecurity.javakafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer1 {

    @KafkaListener(topics = "User", groupId = "System-Users")
    public void listen1(String message) {
        System.out.println("Received Message: from Consumer 1 " + message);
    }


//    @KafkaListener(topics = "Activities", groupId = "System-Users")
//    public void listen2(String message) {
//        System.out.println("Received Message: from Consumer 1 " + message);
//    }





}
