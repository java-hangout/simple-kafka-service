package com.jh.kafka.controller;

import com.jh.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Veeresh N
 * @version 1.0
 */
@RestController
public class KafkaController {
    @Autowired
    KafkaProducerService kafkaProducerService;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        for(int i =0;i<10000;i++) {
            kafkaProducerService.sendMessage(message +" "+i);
        }
        return ResponseEntity.ok("My First Kafka Message Publish Successfully...!!");
    }


}
