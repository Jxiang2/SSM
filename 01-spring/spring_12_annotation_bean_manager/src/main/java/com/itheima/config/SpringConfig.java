package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//代替配置文件
@Configuration
//扫描com.itheima为root dir
@ComponentScan({"com.itheima"})
public class SpringConfig {
}
