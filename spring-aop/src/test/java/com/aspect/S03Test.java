package com.aspect;

import aspect.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/10/29 12:49
 */
public class S03Test {

    /**
     * 环绕通知测试 @Around
     */
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        // 取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");

        String s = someService.doSome("张三", 22);
        System.out.println("在测试方法中目标方法的返回值：" + s);

    }

}
