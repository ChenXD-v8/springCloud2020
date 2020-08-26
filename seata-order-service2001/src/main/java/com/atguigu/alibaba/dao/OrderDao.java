package com.atguigu.alibaba.dao;

import com.atguigu.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaoChen
 */
@Mapper
public interface OrderDao {

    /**
     *  新建订单
     * @param order 订单信息
     */
    void create(Order order);

    /**
     * 修改订单状态 从0改为1
     * @param userId 用户id
     * @param status  订单状态
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
