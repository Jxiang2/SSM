package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //1.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean（根据bean配置id获取）
        BookService bookService = (BookService) ctx.getBean("bookService");

        //3.业务逻辑
        bookService.save();

    }
}
