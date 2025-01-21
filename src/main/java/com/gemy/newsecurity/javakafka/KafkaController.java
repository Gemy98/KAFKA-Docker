package com.gemy.newsecurity.javakafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish1")
    public String publish1(@RequestParam("message") String message) {
        kafkaProducer.sendMessage("User", message);
        return "Message published successfully";
    }


    @PostMapping("/publish2")
    public String publish2(@RequestParam("message") String message) {
        kafkaProducer.sendMessage("Activities", message);
        return "Message published successfully";
    }

}
