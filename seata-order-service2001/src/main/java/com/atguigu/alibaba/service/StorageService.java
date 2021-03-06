package com.atguigu.alibaba.service;

import com.atguigu.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaoChen
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    /**
     *  更新库存信息
     * @param productId  商品id
     * @param count  商品数量
     * @return
     */
    @PutMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
