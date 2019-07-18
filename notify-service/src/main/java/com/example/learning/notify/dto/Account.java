package com.example.learning.notify.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-17
 * @description
 * @since 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "account")
public class Account {
    private String name;
    private String password;
}
