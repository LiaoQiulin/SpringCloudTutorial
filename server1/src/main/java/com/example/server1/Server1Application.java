package com.example.server1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Server1Application {

    @Autowired
    Server2Feign server2Feign;

    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class, args);
    }


    @GetMapping("test/feign")
    public String feign() {
        log.info("feign");
        return server2Feign.feign();
    }




}
