package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService  paymentInfo_TimeOut , o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return this.getClass().getName()+ Thread.currentThread().getStackTrace()[1].getMethodName()+"  o(╥﹏╥)o";
    }
}
