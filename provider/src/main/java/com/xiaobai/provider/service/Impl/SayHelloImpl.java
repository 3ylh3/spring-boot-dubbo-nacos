package com.xiaobai.provider.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaobai.api.service.SayHelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class SayHelloImpl implements SayHelloService {
    @Override
    public String sayHello(String name){
        return "Hello " + name;
    }
}
