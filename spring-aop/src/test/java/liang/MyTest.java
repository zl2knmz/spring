package liang;

import liang.pojo.Users;
import liang.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zl
 * @date 2022/11/13 0:11
 */
public class MyTest {
    @Test
    public void testUsers() {
        // 创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("liang/applicationContext_service.xml");

        // 取出 UsersServiceImpl
        UsersService usersService = (UsersService) ac.getBean("usersServiceImpl");
        int num = usersService.save(new Users(100L, "张三", "123"));
        System.out.println(num);
    }
}
