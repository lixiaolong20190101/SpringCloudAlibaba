package com.zhiyong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //可以动态获取配置中心的信息
public class ConfigController {
    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private String userAge;
    @RequestMapping("/getConfig")
    public String getConfig(){
        return userName+":"+userAge;
    }
}
