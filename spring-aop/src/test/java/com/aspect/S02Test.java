package com.aspect;

import aspect.s02.SomeService;
import aspect.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/10/29 12:49
 */
public class S02Test {

    /**
     * 后置通知测试 @AfterReturning
     */
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService)ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());

        String s = someService.doSome("张三", 22);
        System.out.println(s);

    }

    /**
     * 修改返回值（8种基本类型（和String）除外）
     * 后置通知测试 @AfterReturning
     */
    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService)ac.getBean("someServiceImpl");

        Student s = someService.getChange();
        System.out.println(s);

    }
}
