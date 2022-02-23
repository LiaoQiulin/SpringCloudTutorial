package com.example.server1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Server1Application {

    @Value("${test.config:}")
    String config;

    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class, args);
    }

    @GetMapping("test/config")
    public String config() {
        return config;
    }
}
