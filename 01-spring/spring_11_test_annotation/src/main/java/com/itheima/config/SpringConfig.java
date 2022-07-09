package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"com.itheima"})
@PropertySource("jdbc.properties")
public class SpringConfig {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${userName}")
    private String userName;
    @Value("${password}")
    private String password;

    @Bean //@Bean修饰的方法，形参根据类型自动装配bookDao
    public DataSource dataSource(BookDao bookDao){
        bookDao.connectToDB(userName, password);

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);

        return ds;
    }
}