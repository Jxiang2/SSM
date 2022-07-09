package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//主配置类

@Configuration
@ComponentScan("com.itheima")
@Import({JdbcConfig.class}) //@Import:导入配置信息
public class SpringConfig {
}
