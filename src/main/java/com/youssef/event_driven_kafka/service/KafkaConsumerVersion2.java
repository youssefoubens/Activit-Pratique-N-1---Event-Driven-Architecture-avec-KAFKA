package com.youssef.event_driven_kafka.service;


import com.youssef.event_driven_kafka.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class KafkaConsumerVersion2 {


    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("**********************");
            System.out.println(input.toString());
            System.out.println("**********************");
        };

}}
