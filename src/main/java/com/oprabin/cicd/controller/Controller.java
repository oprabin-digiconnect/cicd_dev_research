package com.oprabin.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: oprabin
 * Date: 2022-07-05
 * Created with IntelliJ IDEA Ultimate
 */

@RestController("/v1")
public class Controller {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to CICD Dev Research Project!";
    }

}
