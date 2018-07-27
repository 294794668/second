package com.example.second.controller;

import com.example.second.service.SelfAutowiredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: pengfei.cheng
 * @Date: 2018/7/27 下午4:39
 * @Company: 易宝支付(YeePay)
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private SelfAutowiredService selfAutowiredService;

    @RequestMapping("{path}")
    @ResponseBody
    public String home(@PathVariable("path") String path) {
        selfAutowiredService.printf(path);
        return path;
    }

}
