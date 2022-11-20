package liang.service.impl;

import liang.mapper.UsersMapper;
import liang.pojo.Accounts;
import liang.pojo.Users;
import liang.service.AccountsService;
import liang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring事务的传播特性
 * 多个事务之间的合作、互斥等都可以通过设置事务的传播特性来解决。
 * 常用
 * PROPAGATION_REQUIRED: 必被包含事务（增删改必用）
 * PROPAGATION_REQUIRES_NEW: 自己新开事务，不管之前是否有事务
 * PROPAGATION_SUPPORTS: 支持事务，如果加入的方法有事务，则支持事务，如果没有不单开事务
 * PROPAGATION_NEVER: 不能运行中事务中，如果包在事务中，抛出异常（方法执行时就报错，不存在回滚）
 * PROPAGATION_NOT_SUPPORTED: 不支持事务，运行在非事务的环境
 * 不常用
 * PROPAGATION_MANDATORY: 必须包在事务中，没有事务则抛出异常
 * PROPAGATION_NESTED: 嵌套事务
 *
 * @author zl
 * @date 2022/11/12 23:55
 */
@Service // 交给spring去创建对象
//@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements UsersService {
    // 在所有的业务逻辑层中一定会有数据访问层的对象
    /**
     *  // 1、读取核心配置文件
     *  InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
     *  // 2、创建工厂对象
     *  SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
     *  // 3、取出sqlSession
     *  sqlSession = factory.openSession(true); // 自动提交事务
     *  // 4、取出动态代理的对象，完成接口中方法的调用，实则是调用xml文件中相应标签的功能
     *  uMapper = sqlSession.getMapper(UsersMapper.class);
     *
     */
    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private AccountsService accountsService;

    @Override
    public int save(Users users) {
        int num = usersMapper.insert(users);
        System.out.println("用户新增成功，" + num);

        // 事务传播
        num = accountsService.save(new Accounts(103L, "李四", "万元户"));
        return num;
    }
}
