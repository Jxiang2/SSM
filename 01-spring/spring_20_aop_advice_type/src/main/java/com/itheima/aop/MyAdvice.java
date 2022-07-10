package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2(){}


    @Before("pt()") //@Before：前置通知，在原始方法运行之前执行
    public void before() {
        System.out.println("before advice ...");
    }


    @After("pt()") //@After：后置通知，在原始方法运行之后执行
    public void after() {
        System.out.println("after advice ...");
    }


    @Around("pt2()") //@Around：环绕通知，在原始方法运行的前后执行
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Integer ret = (Integer) pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

    @AfterThrowing("pt2()") //@AfterThrowing：抛出异常后通知，在原始方法执行过程中出现异常后运行
    public void afterThrowing() {
        System.out.println("ready to throw exception ...");
    }
}
