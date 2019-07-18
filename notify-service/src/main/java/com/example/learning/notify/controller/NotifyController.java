package com.example.learning.notify.controller;

import com.example.learning.notify.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-17
 * @description
 * @since 1.0
 */
@RefreshScope
@RestController
public class NotifyController {

    @Autowired
    private Account account;

    @GetMapping("/account")
    public String test() {
        return account.getName();
    }
}
