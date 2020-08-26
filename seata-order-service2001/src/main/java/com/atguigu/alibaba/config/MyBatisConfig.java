package com.atguigu.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atguigu.alibaba.dao"})
public class MyBatisConfig {

}
