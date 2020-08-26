package com.atguigu.alibaba.service;

import com.atguigu.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author xiaoChen
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 根据订单信息从用户账号扣钱
     * @param userId 用户id
     * @param money  订单所用金额
     * @return
     */
    @PutMapping("/account/decrease")
    CommonResult decreaseMoney(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
