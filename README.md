# SSM
### Spring 
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

### SpringBoot 
### MyBatis
