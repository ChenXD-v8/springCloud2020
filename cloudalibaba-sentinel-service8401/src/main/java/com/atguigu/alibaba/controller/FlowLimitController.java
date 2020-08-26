package com.atguigu.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaoChen
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA(){
        return "------testA";
    }

    @GetMapping(value = "/testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"\t"+"testB");
        return "------testB";
    }




    @GetMapping("/testD")
    public String testD()
    {
//        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }

        int age = 10 /0;
        log.info("testD 测试RT test 异常比例");


        return "------testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
//        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }

        int age = 10 /0;
        log.info("testE 测试RT test 异常比例");


        return "------testE";
    }

    @GetMapping(value = "/test-hot-key")
    @SentinelResource(value = "test-hot-key",blockHandler = "deal")
    public String testHotKey(@RequestParam(name = "p1",required = false) String p1,@RequestParam(name = "p2",required = false) String p2){
        return "------testHotKey success";
    }

    public String deal(String p1, String p2, BlockException exception){
        return "不好意思 热点限流了哦";
    }


}
