package com.heqing.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author heqing
 * @date 2021/7/14 10:40
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApplication {

    public static void main(String[] args) {
        new SpringApplication(FeignApplication.class).run(args);
    }

}
