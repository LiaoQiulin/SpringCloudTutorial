package com.example.server1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * create by 廖秋林/13600364044 in 2022/2/26
 */
@FeignClient("server2")
interface Server2Feign {

    @GetMapping("test/feign")
    String feign();

}
