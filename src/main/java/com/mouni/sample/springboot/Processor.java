package com.mouni.sample.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Processor {

    @Value("${message}")
    private String message;



    public void doStart(){
        log.info("Hey!!");
        log.info(message);
    }
}
