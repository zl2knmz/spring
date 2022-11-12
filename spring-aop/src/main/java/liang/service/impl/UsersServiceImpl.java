package liang.service.impl;

import liang.mapper.UsersMapper;
import liang.pojo.Users;
import liang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zl
 * @date 2022/11/12 23:55
 */
@Service // 交给spring去创建对象
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
    UsersMapper usersMapper;

    public int save(Users users) {
        return usersMapper.insert(users);
    }
}
