//package com.youssef.event_driven_kafka.configuration;
//import com.youssef.event_driven_kafka.Employee;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//
//import org.springframework.context.annotation.Bean;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class Producerconf {
//
//    @Bean
//    ProducerFactory<String, Employee> producerFactory(){
//        Map<String,Object> config=new HashMap<>();
//        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"http://localhost:9092");
//        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        return new DefaultKafkaProducerFactory<>(config);
//    }
//    @Bean
//    KafkaTemplate<String,Employee> kafkaTemplate(){
//        return new KafkaTemplate<>(producerFactory());
//    }
//}
