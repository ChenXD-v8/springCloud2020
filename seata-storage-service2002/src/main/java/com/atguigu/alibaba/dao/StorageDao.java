package com.atguigu.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaoChen
 */
@Mapper
public interface StorageDao {

    /**
     * 更新库存信息
     * @param productId 商品id
     * @param used 使用情况
     */
    void update(@Param("productId") Long productId, @Param("used") Integer used);

}
