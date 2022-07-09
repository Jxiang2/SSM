package com.xjy.service;

import com.xjy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookServiceImpl implements BookService{
    @Value("xjy")
    private String operatorUsername;

    @Value("123455")
    private String operatorPwd;

    @Autowired
    private BookDao bookdao;

    public Map<String, String> runService() {
        System.out.println("ready to run book service ...");
        bookdao.connectToDB(operatorUsername, operatorPwd);
        return bookdao.executeBookQuery();
    }
}
