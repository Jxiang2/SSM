package com.xjy;
import com.xjy.config.SpringConfig;
import com.xjy.dao.BookDao;
import com.xjy.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean(BookService.class);
        Map<String, String> queryMap = bookService.runService();
        System.out.println(queryMap);

        ctx.close();
    }
}
