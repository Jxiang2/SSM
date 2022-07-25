package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//定义表现层控制器bean
@Controller
public class UserController {
    @RequestMapping("/save") //设置映射路径为/save，即外部访问路径
    @ResponseBody //设置当前操作返回结果为指定json数据（本质上是一个字符串信息）
    public String save(){
        System.out.println("user save ...");
        return "{'info':'springmvc save'}";
    }

    @RequestMapping("/delete") //设置映射路径为/delete，即外部访问路径
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'info':'springmvc delete'}";
    }
}
