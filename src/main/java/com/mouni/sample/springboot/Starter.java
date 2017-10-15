package com.mouni.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@EnableEurekaClient
@SpringBootApplication
public class Starter {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Starter.class);
        Processor processor = applicationContext.getBean(Processor.class);
        try {
            processor.doStart();
        } finally {
            SpringApplication.exit(applicationContext);
        }
    }
}
