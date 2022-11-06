package com.aspect;

import aspect.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/10/29 12:49
 */
public class S04Test {

    /**
     * 最终通知测试 @After
     * 异常情况：@After 会执行
     */
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");

        String s = someService.doSome("张三", 22);
        System.out.println("在最终通知-测试方法中目标方法的返回值：" + s);

    }

}
