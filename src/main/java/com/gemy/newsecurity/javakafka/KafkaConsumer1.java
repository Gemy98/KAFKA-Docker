package com.gemy.newsecurity.javakafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer1 {

    @KafkaListener(topics = "User", groupId = "group1")
    public void listen(ConsumerRecord<String, String> record) throws InterruptedException {
        String message = record.value();

        for (int i = 0; i < 50; i++) { // Reprocess the message 3 times as an example
            System.out.println("Processing Message (Attempt " + (i + 1) + "): " + message);

            // Simulate 15-second delay between processing
            Thread.sleep(10);
        }

        // Manually acknowledge the message after processing
      //  acknowledgment.acknowledge();
    }
   }






