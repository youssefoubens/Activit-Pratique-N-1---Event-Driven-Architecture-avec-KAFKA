package com.youssef.event_driven_kafka.service;


import com.youssef.event_driven_kafka.entities.PageEvent;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;


@Service
@EnableScheduling
public class KafkaConsumerVersion2 {


    @Autowired
    private StreamBridge streamBridge;
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("**********************");
            System.out.println(input.toString());
            System.out.println("**********************");
        };
    }



//    @Scheduled(fixedDelay = 1000)
//    public void publishPageEvent() {
//        PageEvent pageEvent = new PageEvent(
//                "youssef" + Math.random() * 10,
//                Math.random() * 10 > 5 ? "U1" : "U2",
//                new Date(),
//                (int) (Math.random() * 100)
//        );
//        streamBridge.send("pageEventProducer-out-0", pageEvent);
//        System.out.println("Published: " + pageEvent);
//    }

    @Bean
    Function<KStream<String, PageEvent>, KStream<String, PageEvent>> pageEventKStream() {
        return (input) -> {
            input.peek((key, value) -> {
                System.out.println("********************** from KStream function");
                System.out.println("Key = " + key + ", Value = " + value);
                System.out.println("**********************");
            });
            return input;
        };
    }



}
