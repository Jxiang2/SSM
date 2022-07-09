package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component //通知类必须配置成Spring管理的bean
@Aspect //设置当前类为切面类类
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())") //设置切入点，代号pt(). 要求配置在方法上方
    private void pt(){}

    @Before("pt()") //设置在切入点pt()的前面运行当前操作（前置通知）
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
