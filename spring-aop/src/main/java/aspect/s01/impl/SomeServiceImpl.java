package aspect.s01.impl;

import aspect.s01.SomeService;

/**
 * @author zl
 * @date 2022/10/28 23:45
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome调用.............");
        return "abc";
    }

    @Override
    public int getSome(String name) {
        System.out.println("getSome调用.............");
        return 0;
    }
}
