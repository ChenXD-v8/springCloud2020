package com.atguigu.alibaba.controller;

import com.atguigu.alibaba.domain.CommonResult;
import com.atguigu.alibaba.domain.Order;
import com.atguigu.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiaoChen
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/order/create")
    public CommonResult create(@RequestBody Order order){
        orderService.create(order);
        return new CommonResult(200,"order create success");
    }
}
