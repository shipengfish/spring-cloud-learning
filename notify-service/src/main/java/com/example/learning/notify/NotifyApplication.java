package com.example.learning.notify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-16
 * @description
 * @since 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class NotifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotifyApplication.class, args);
    }

}
