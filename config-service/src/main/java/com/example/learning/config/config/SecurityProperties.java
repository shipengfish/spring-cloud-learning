package com.example.learning.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.security")
public class SecurityProperties {
    private final User user = new User();
    @Data
    public static class User {
        private String name;
        private String password;
    }
}
