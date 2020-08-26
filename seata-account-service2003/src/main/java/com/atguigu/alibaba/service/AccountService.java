package com.atguigu.alibaba.service;

import com.atguigu.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author xiaoChen
 */
public interface AccountService {


    void decrease(Long userId, BigDecimal money);
}
