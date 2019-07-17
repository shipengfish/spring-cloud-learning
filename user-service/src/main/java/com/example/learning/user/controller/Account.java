package com.example.learning.user.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-17
 * @description
 * @since 1.0
 */
@Data
public class Account {
    private String name;
    private String password;
}
