package com.youssef.event_driven_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EventDrivenKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenKafkaApplication.class, args);
    }

}
