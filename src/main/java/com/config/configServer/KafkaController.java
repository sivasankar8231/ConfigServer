package com.config.configServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final ConfigServerProducer producerService;

    public KafkaController(ConfigServerProducer producerService) {
        this.producerService = producerService;
    }
    @PostMapping("/publish")
    public String publishMessage(@RequestParam String msg) {
        producerService.sendMessage(msg);
        return "Message sent: " + msg;
    }
}
