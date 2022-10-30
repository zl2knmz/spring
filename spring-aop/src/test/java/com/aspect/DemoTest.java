package com.aspect;

import aspect.s01.SomeService;
import aspect.s01.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/10/29 12:49
 */
public class DemoTest {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService)ac.getBean("someService");
        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 22);
        System.out.println(s);

        int li = someService.getSome("李四");
        System.out.println(li);
    }

    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        // 取出代理对象
        SomeServiceImpl someService = (SomeServiceImpl)ac.getBean("someService");
        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 22);
        System.out.println(s);

    }

    @Test
    public void test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService)ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 22);
        System.out.println(s);

    }
}
