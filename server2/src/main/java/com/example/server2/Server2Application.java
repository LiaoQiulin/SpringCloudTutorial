package com.example.server2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class Server2Application {


    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }


    @GetMapping("test/feign")
    public String feign() {
        final int i = new Random().nextInt();
        log.info("feign:{}", i);
        return "I'm server2. " + i;
    }


}
