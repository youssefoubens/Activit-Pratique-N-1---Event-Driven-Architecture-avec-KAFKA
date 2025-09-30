package com.youssef.event_driven_kafka.configuration;

import com.youssef.event_driven_kafka.Employee;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConsumerConf {

    @Bean
    ConsumerFactory<String, Employee> consumerFactory(){
        Map<String, Object> config=new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"http://localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"enset_uh2c");
        JsonDeserializer<Employee> jsonDeserializer=new JsonDeserializer<>(Employee.class);
        jsonDeserializer.addTrustedPackages("*");
        jsonDeserializer.setUseTypeHeaders(false);
        return new DefaultKafkaConsumerFactory(config,new StringDeserializer(),jsonDeserializer);
    }
    @Bean
    ConcurrentKafkaListenerContainerFactory<String, Employee> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Employee> factory=new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
