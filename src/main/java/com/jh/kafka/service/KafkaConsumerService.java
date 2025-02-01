package com.jh.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Veeresh N
 * @version 1.0
 */
@Service
public class KafkaConsumerService {
    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
    @KafkaListener(topics = "myfirsttopic", groupId = "myfirstgroup")
    public void listen(String message) {
        logger.info("message : {}", message);
    }
}
