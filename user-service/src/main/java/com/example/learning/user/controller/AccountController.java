package com.example.learning.user.controller;

import com.example.learning.user.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-17
 * @description
 * @since 1.0
 */
@RestController
public class AccountController {

    @Autowired
    private Account account;

    @GetMapping("/account")
    public String test() {
        return account.getName();
    }
}
