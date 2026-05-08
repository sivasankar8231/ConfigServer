package com.config.configServer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConfigServerProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    public ConfigServerProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        kafkaTemplate.send("my-topic", message);
    }
}
