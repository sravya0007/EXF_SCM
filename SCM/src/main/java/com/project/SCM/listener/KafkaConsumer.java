package com.project.SCM.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.project.SCM.models.Users;


@Service
public class KafkaConsumer {

  /*  @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Users user) {
        System.out.println("Consumed JSON Message: " + user);
    }*/
}