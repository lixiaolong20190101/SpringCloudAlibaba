package com.zhiyong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @RequestMapping("/stock")
    public String reduct(){
        System.out.println("下单成功！");
        return "扣除成功！";
    }
}
