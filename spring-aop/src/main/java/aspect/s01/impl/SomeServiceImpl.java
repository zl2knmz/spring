package aspect.s01.impl;

import aspect.s01.SomeService;

/**
 * @author zl
 * @date 2022/10/28 23:45
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        return "abc";
    }

}
