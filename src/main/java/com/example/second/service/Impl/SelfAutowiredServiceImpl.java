package com.example.second.service.Impl;

import com.example.second.service.SelfAutowiredService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @Author: pengfei.cheng
 * @Date: 2018/7/27 下午4:57
 * @Company: 易宝支付(YeePay)
 */
@Service
public class SelfAutowiredServiceImpl implements SelfAutowiredService {

    @Inject
    private SelfAutowiredService selfAutowiredService;


    @Override
    public void sout(String path) {
        System.out.println(path);
    }

    @Override
    public void printf(String path) {
        selfAutowiredService.sout(path);
    }
}
