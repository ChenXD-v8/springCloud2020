package com.atguigu.alibaba.service.impl;

import com.atguigu.alibaba.dao.OrderDao;
import com.atguigu.alibaba.domain.Order;
import com.atguigu.alibaba.service.AccountService;
import com.atguigu.alibaba.service.OrderService;
import com.atguigu.alibaba.service.StorageService;
import com.sun.xml.internal.bind.v2.TODO;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoChen
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "default",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------>开始新建订单，订单信息："+order);
        orderDao.create(order);

        log.info("------>订单微服务调用库存，做扣减,扣减数量："+order.getCount());
        storageService.decrease(order.getProductId(),order.getCount());

        log.info("------>调用账户微服务，开始扣钱,扣除金额："+order.getMoney());
        accountService.decreaseMoney(order.getUserId(),order.getMoney());
        log.info("------> 扣钱完毕");

        // TODO: 2020/8/26 库存和 微服务待完成
        log.info("------>订单状态");
        orderDao.update(order.getUserId(),0);

        log.info("------>创建订单完成！");
    }
}
