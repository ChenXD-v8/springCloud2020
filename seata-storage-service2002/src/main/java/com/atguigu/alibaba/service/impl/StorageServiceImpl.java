package com.atguigu.alibaba.service.impl;

import com.atguigu.alibaba.dao.StorageDao;
import com.atguigu.alibaba.domain.CommonResult;
import com.atguigu.alibaba.domain.Storage;
import com.atguigu.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaoChen
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("---->扣减库存开始");
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        storageDao.update(productId,count);
        LOGGER.info("---->扣减库存完成");
    }
}
