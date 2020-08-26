package com.atguigu.alibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author xiaoChen
 */
public class CustomerBlockHandler {

    public static CommonResult customerHandler1(BlockException exception){
        return new CommonResult(444,"global exception handler class ---method 1 ");
    }
    public static CommonResult customerHandler2(BlockException exception){
        return new CommonResult(444,"global exception handler class ---method 2 "+exception.getClass().getCanonicalName());
    }
}
