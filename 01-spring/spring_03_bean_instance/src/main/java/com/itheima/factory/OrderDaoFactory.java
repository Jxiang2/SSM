package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        //静态工厂方法可以增加一些原有bean以外的业务逻辑
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
