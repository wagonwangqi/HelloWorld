package com.test1.controller;

import groovy.transform.ASTTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boolean
 * Date: 2019/7/2 19:48
 * description:
 */
@RequestMapping("/base")
@RestController
public class BaseHello {
    @RequestMapping("/hello")
    public String hello11(){
        return "he";
    }
}
