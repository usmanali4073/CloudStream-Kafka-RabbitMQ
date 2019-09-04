package com.speaya.streamkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)
public class KafkaService {

    @Autowired
    RabbitMQService rabbitMQService;

    @StreamListener(Sink.INPUT)
    public void handle(String data) {
        rabbitMQService.send(data);
        System.out.println("Received: " + data);
    }
}
