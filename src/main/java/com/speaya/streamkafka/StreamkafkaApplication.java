package com.speaya.streamkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication

public class StreamkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamkafkaApplication.class, args);
	}




}
