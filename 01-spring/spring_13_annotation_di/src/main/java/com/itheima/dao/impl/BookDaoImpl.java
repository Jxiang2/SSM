package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao1")
public class BookDaoImpl implements BookDao {

    @Value("${name}") //直接赋值，可加载 *.properties的值
    private String name;

    public void save() {
        System.out.println("book dao save ..." + name);
    }
}
