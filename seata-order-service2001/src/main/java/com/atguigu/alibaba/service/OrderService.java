package com.atguigu.alibaba.service;

import com.atguigu.alibaba.domain.Order;

/**
 * @author xiaoChen
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order 订单信息
     */
    void create(Order order);
}
