package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    //给IOC容器提供对应set方法以执行，容器给类set property
    public void setBd(BookDao papa) {
        this.bookDao = papa;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
