package com.youssef.event_driven_kafka.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = {"testTopic"},groupId = "enset_uh2c")
    public void onMessage(String message){
        System.out.println("Consume ====>:"+message);
    }
}
