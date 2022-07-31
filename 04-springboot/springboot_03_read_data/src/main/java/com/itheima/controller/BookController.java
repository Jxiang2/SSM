package com.itheima.controller;

import com.itheima.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    //使用@Value读取单一属性数据
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject_00;

    //使用Environment封装全配置数据
    @Autowired
    private Environment env;

    //使用配置对象读取配置文件
    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject_00);
        System.out.println("--------------------");
        System.out.println(env.getProperty("lesson"));
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("enterprise.age"));
        System.out.println(env.getProperty("enterprise.subject[1]"));
        System.out.println("---------------------");
        System.out.println(enterprise);
        return "hello , spring boot!" + id;
    }

}


