package liang.service.impl;

import liang.mapper.AccountsMapper;
import liang.pojo.Accounts;
import liang.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zl
 * @date 2022/11/12 23:55
 */
@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsMapper accountsMapper;

    /**
     * @Transactional 可添加到方法上和类上，测试使用
     * 生产还是使用声明式事物
     */
//    @Transactional(propagation = Propagation.REQUIRED, // 事务的传播特性，REQUIRED表示增删改查操作时必须添加的事务传播特性
//            noRollbackForClassName = "ArithmeticException", // 指定发生什么异常不回滚，使用的是异常的名称
//            noRollbackFor = ArithmeticException.class, // 指定发生什么异常不回滚，使用的是异常的类型
//            rollbackForClassName = "NullPointerException", // 指定发生什么异常必须回滚
//            rollbackFor = NullPointerException.class, // 指定发生什么异常必须回滚
//            timeout = -1, // 连接超时设置，默认值是-1，表示永不超时
//            readOnly = false, // 默认是false，如果是查询操作，必须设置为true。
//            isolation = Isolation.DEFAULT // 使用数据库自己的隔离级别（mysql 默认可重复读）
//    )
//    @Transactional(propagation = Propagation.NEVER)
    @Override
    public int save(Accounts accounts) {
        int num = 0;
        num = accountsMapper.insert(accounts);
        System.out.println("增加账户成功，num=" + num);

        // 手工抛出异常
        System.out.println(1 / 0);
        return num;
    }

}
