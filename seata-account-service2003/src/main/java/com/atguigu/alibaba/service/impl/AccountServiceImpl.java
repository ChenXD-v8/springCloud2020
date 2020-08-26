package com.atguigu.alibaba.service.impl;

import com.atguigu.alibaba.dao.AccountDao;
import com.atguigu.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author xiaoChen
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("---->开始扣钱");
        accountDao.update(userId,money);
        LOGGER.info("---->扣钱完成");
    }
}
