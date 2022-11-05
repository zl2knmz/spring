package aspect.s02;

import lombok.Data;

/**
 * @author zl
 * @date 2022/11/5 23:35
 */
@Data
public class Student {
    private String name;
    private Integer age;

    public Student() {

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
