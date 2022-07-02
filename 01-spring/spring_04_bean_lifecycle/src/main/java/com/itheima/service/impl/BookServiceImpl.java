package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("set dependencies.....");
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    //继承自DisposableBean， InitializingBean
    public void destroy() throws Exception {
        //在bean销毁前执行
        System.out.println("service destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        //在IOC中DI setters执行完后后执行
        System.out.println("service init...");
    }
}
