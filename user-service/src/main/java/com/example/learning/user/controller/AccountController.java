package com.example.learning.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-07-17
 * @description
 * @since 1.0
 */
@RestController
public class AccountController {

    @Value("${account.name}")
    private String name;

    @PostConstruct
    public void init() {

    }

    @GetMapping("/account")
    public void test() {
        try {
            System.out.println(name);
            File file = ResourceUtils.getFile("account.yml");
            System.out.println(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
