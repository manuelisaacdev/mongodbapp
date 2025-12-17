package com.mongodbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class MongodbappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbappApplication.class, args);
    }

}
