//package com.youssef.event_driven_kafka.controller;
//
//
//import com.youssef.event_driven_kafka.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class KafkaWeb {
//
//    @Autowired
//    private KafkaTemplate<String,Employee> kafkaTemplate;
//    private String topic="testTopic";
//    @GetMapping("/publish/{name}")
//    public String publishMessage(@PathVariable String name) {
//        Employee employee = new Employee(name, 45000.0);
//        kafkaTemplate.send(topic, employee);
//        return "Message Published";
//    }
//
//}
