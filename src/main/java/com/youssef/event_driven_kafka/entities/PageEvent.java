package com.youssef.event_driven_kafka.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor @NoArgsConstructor
public class PageEvent {

    private String name;
    private String type;
    private java.util.Date date;
    private int value;
}
