package com.zhiyong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Value("${server.port}")
    private  String port;
    @RequestMapping("/stock")
    public String reduct(){
        System.out.println("下单成功！");
        return "扣除成功！"+port;
    }
}
