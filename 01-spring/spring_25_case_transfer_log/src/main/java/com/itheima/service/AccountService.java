package com.itheima.service;

import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;

public interface AccountService {
    //rollback:设置当前事务参与回滚的异常，默认非runtime异常不参与回滚
    @Transactional //@Transactional(rollbackFor = IOException.class)
    void transfer(String out,String in ,Double money) throws IOException;
}
