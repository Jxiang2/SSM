package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //1.加载相对类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookDao bookDao0 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = ctx.getBean("bookDao", BookDao.class);
        // there must be 1 bookDao object in IOC container, or error
        BookDao bookDao2 = ctx.getBean(BookDao.class);

        // the 3 should be the same
        System.out.println(bookDao0);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}
