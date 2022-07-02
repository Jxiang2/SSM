package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDaoxx, UserDao userDaoxx) {
        this.bookDao = bookDaoxx;
        this.userDao = userDaoxx;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
