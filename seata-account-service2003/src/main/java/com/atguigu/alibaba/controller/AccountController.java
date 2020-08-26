package com.atguigu.alibaba.controller;

import com.atguigu.alibaba.domain.CommonResult;
import com.atguigu.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author xiaoChen
 */
@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PutMapping("/account/decrease")
    CommonResult decreaseMoney(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"decrease money success");
    }
}
