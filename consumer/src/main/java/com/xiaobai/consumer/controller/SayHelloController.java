package com.xiaobai.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaobai.api.service.SayHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @Reference
    private SayHelloService sayHelloService;
    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("name")String name){
        return sayHelloService.sayHello(name);
    }
}
