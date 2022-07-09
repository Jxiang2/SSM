package com.itheima.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookDaoImpl implements BookDao {
    @Value("http://localhost:3000")
    private String url;

    @Value("SELECT * FROM books")
    private String bookQuery;

    @Value("true")
    private boolean isAuthorized;

    public void connectToDB(String username, String pwd) {
        if (pwd.isEmpty()) {
            System.out.println("Failed to connect to DB");
        } else {
            System.out.println(username + " has connected to DB");
        }
    }

    public Map<String, String> executeBookQuery() {
        Map<String, String> queryMap = new HashMap<>();

        if (isAuthorized) {
            queryMap.put("url", url);
            queryMap.put("query", bookQuery);
        } else {
            queryMap.put("msg", "401 unauthorized");
        }

        return queryMap;
    }
}
