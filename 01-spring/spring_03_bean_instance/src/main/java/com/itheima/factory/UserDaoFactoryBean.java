package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始静态工厂中创建对象的方法
    public UserDao getObject() {
        System.out.println("Using Factory Bean");
        return new UserDaoImpl();
    }

    public Class getObjectType() {
        return UserDao.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
