package aspect.s03;

import org.springframework.stereotype.Service;

/**
 * @author zl
 * @date 2022/11/6 10:58
 */
@Service
public class SomeServiceImpl implements SomeService {

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()调用.........." + name);
        return "abc";
    }
}