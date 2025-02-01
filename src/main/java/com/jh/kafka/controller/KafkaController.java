package com.jh.kafka.controller;

import com.jh.kafka.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Naidu
 * @version 1.0
 */

@RestController
public class KafkaController {

    private  final Logger logger = LoggerFactory.getLogger(KafkaController.class);
    @Autowired
    KafkaProducerService kafkaProducerService;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        for(int i =0;i<10000;i++) {
            kafkaProducerService.sendMessage(message +" "+i);
        }
        logger.info("My first kafka message sent successfully to kafka topic....!!!");
        return ResponseEntity.ok("My First Kafka Message Publish Successfully...!!");
    }


}
