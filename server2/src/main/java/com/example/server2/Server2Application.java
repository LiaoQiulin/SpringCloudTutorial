package com.example.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class Server2Application {


    public static void main(String[] args) {
        SpringApplication.run(Server2Application.class, args);
    }


    @GetMapping("test/discovery")
    public String discovery() {
        return "I'm server2.";
    }
}
