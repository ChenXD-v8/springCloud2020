package com.atguigu.alibaba.controller;

import com.atguigu.alibaba.domain.CommonResult;
import com.atguigu.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoChen
 */
@RestController
@Slf4j
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PutMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"decrease storage success");
    }
}
