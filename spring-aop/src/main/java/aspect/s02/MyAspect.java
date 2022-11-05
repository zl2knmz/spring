package aspect.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 此类为切面类，包含各种切面方法。
 * @author zl
 * @date 2022/10/28 23:45
 */
@Aspect
@Component
public class MyAspect {

    /**
     * 所有切面的功能都是由切面方法来实现的
     * 可以将各种切面都在此类中进行开发
     *
     * 前置通知的切面方法的规范
     * 1、访问权限是public
     * 2、方法的返回值是void
     * 3、方法名称自定义
     * 4、方法有参数（也可以没有参数，如果目标方法没有返回值，则可以写无参的方法，但一般会写有参，
     * 这样可以处理无参也可以处理有参） 这个切面方法的参数就是目标方法的返回值
     * 5、使用@AfterReturning注解表明是后置通知
     *  参数：value 指定切入点表达式
     *        returning: 指定目标方法的返回值的名称，则名称必须与切面方法的参数名称一致。
     *
     */

    @AfterReturning(value = "execution(* aspect.s02.*.*(..))", returning = "obj")
    public void myAfterReturning(Object obj){
        System.out.println("后置功能实现............");
        if (null != obj) {
            obj = obj.toString().toUpperCase();
            System.out.println("在切面方法中目标方法的返回值：" + obj);
        }
    }

}
