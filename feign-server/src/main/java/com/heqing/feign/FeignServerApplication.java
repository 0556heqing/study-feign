package com.heqing.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heqing
 * @date 2021/7/14 10:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FeignServerApplication {

    public static void main(String[] args) {
        new SpringApplication(FeignServerApplication.class).run(args);
    }

}
