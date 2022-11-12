package liang.pojo;

import lombok.Data;

/**
 * @author zl
 * @date 2022/11/12 23:27
 */
@Data
public class Users {
    private Long id;
    private String name;
    private String password;

    public Users() {}

    public Users(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
