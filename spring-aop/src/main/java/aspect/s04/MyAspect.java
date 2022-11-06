package aspect.s04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 最终通知
 *
 * @author zl
 * @date 2022/11/6 10:59
 */
@Component
@Aspect
public class MyAspect {

    /**
     * 最终通知方法的规范
     * 1、访问权限是public
     * 2、切面方法没有返回值
     * 3、方法名称自定义
     * 4、方法没有参数，如果有也只能是JoinPoint
     * 5、使用@After注解声明是最终通知
     *    参数：
     *        value：指定切入点表达式
     */
    @After(value = "execution(* aspect.s04.*.*(..))")
    public void myAfter() {
        // 最终功能实现
        System.out.println("最终通知功能实现............");
    }

}
