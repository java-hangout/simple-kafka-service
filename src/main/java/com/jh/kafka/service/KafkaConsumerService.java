package com.jh.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Veeresh N
 * @version 1.0
 */
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "myfirsttopic", groupId = "myfirstgroup")
    public void listen(String message) {
        System.out.println("message : " + message);
    }
}
