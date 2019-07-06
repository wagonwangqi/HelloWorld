package com.test1.controller;

import com.test1.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boolean
 * Date: 2019/7/2 19:48
 * description:
 */
@RestController("/redisHello")
public class RedisHello {
    @RequestMapping("/hello3")
    public String hello3(){
        return "hello, springboot";
    }
}
