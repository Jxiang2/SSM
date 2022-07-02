package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource1 = (DataSource) ctx.getBean("dataSource1");
        System.out.println(dataSource1);

        DataSource dataSource2 = (DataSource) ctx.getBean("dataSource2");
        System.out.println(dataSource2);


        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
