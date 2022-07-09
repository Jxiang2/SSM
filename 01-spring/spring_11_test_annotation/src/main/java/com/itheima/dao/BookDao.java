package com.itheima.dao;

import java.util.Map;

public interface BookDao {
    Map<String, String> executeBookQuery();

    void connectToDB(String username, String pwd);
}
