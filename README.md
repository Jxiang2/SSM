# SSM
### Spring 
*Bean Scope*
1. default: singleton, only instantiate the class once when accessing a bean from ApplicationContext
2. prototype: create multiple instances when accessing a bean from ApplicationContext multiple times 

*Bean Lifecycle*
1. initialize IOC container
    1. assign memories for objects accroding to applicationContext.xml
    2. excute the constructor methods of the objects
    3. excute DI setters
    4. excute bean init method through init() with applicationContext.xml; Or afterPropertiesSet() from InitializingBean interface
2. use beans in IOC container
    1. bussiness logics ...
3. destroy beans
    1. excute the destroy() method from DisposableBean interface
    2. excute an anotherDestroy() method with applicationContext.xml, if applicable
    3. bean destroyed, with excuting ctx.close() or ctx.registerShutdownHook() in main method

*Bean DI*
1. primitiive types, reference types with setters
```
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
    <!--property标签：设置注入属性-->
    <!--name属性：设置注入的属性名，实际是set方法对应的名称-->
    <!--value属性：设置注入简单类型数据值. ref属性：设置注入引用类型bean的id或name-->
    <property name="connectionNum" value="100"/>
    <property name="databaseName" value="mysql"/>
    <property name="bookDao" ref="bookDao"/>
    <property name="userDao" ref="userDao"/>
</bean>
```
2. primitiive types, reference types with constructors
```
<bean id="bookDao" class="com.itheima.dao.impl.BookDaoImpl">
        <!--根据构造方法形参数位置注入-->
        <constructor-arg index="0" value="mysql"/>
        <constructor-arg index="1" value="100"/>
        <!--name指的是构造起形参名字-->
        <constructor-arg name="bookDaoxx" ref="bookDao"/>
        <constructor-arg name="userDaoxx" ref="userDao"/>
</bean>
```
3. autowired
```
<!--autowire should be processed byType-->
<!--setters of BookDaoImpl need to be provided in bookServiceImpl class-->
<bean class="com.itheima.dao.impl.BookDaoImpl"/>
<bean id="bookService" class="com.itheima.service.impl.BookServiceImpl" autowire="byType"/>
```

*AOP (Proxy Pattern)*
1. AOP workflow
    1. Spring IOC container is initialized
    2. read all used @Pointcut methods in classes with @Aspect
    3. IOC intialize beans; Check if beans have methods that match to @Pointcut methods
        1. if a bean has no match, initialize it as an instance
        2. if a bean (target) has a match, initialize a proxy instance to the target
    4. bean and proxies are all in IOC container and are used ...
2. AOP practice
    1. enable AOP in SpringConfig file; Create @Aspect bean to hold aspects, the class is named *Advice
    ```
    // SpringConfig.java
    @Configuration
    @ComponentScan("com.itheima")
    @EnableAspectJAutoProxy
    public class SpringConfig {
        ...
    }
    
    @Component
    @Aspect
    public class MyAdvice {
        ...
    }
    ```
    2. create @Pointcut("excution()") decorated methods to match methods need to be processed.
    ```
    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
    private void pt(){}
    ```
    3. use @Before("pt()"), @After("pt()"), @Around("pt()") to decorate methods integrating old and new logics
    ```
    @Before("pt()")
    public void beforeMethod(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ..." );
    }

    @After("pt()")
    public void afterMethod(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    //ProceedingJoinPoint：专用于环绕通知，是JoinPoint子类，可以实现对原始方法的调用
    @Around("pt()")
    public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = pjp.proceed(args);
        return ret;
    }
    ```
  


### SpringBoot 
### MyBatis
