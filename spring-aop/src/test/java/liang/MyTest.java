package liang;

import liang.pojo.Accounts;
import liang.pojo.Users;
import liang.service.AccountsService;
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
        int num = usersService.save(new Users(101L, "张三1", "1234"));
        System.out.println(num);
    }

    @Test
    public void testAccounts() {
        // 创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("liang/applicationContext_service.xml");

        // 取出 AccountsServiceImpl
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");

        System.out.println("-----getClass------" + accountsService.getClass());
        int num = accountsService.save(new Accounts(105L, "李四5", "账户安全5"));
        System.out.println(num);
    }
}
