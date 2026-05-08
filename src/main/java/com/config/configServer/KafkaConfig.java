package com.config.configServer;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;


@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic myTopic() {
        System.out.println("Welcome to the Config Topic");
        return TopicBuilder.name("my-topic")
                .partitions(3)
                .replicas(1)
                .build();
    }

}
