package com.aspect;

import aspect.s05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/10/29 12:49
 */
public class S05Test {

    /**
     * 异常通知测试 @AfterThrowing
     * 异常情况：@AfterThrowing 会执行
     */
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s05/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");

        String s = someService.doSome("张三", 22);
        System.out.println("在异常通知-测试方法中目标方法的返回值：" + s);

    }

}
