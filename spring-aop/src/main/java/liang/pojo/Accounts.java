package liang.pojo;

import lombok.Data;

/**
 * @author zl
 * @date 2022/11/12 23:27
 */
@Data
public class Accounts {
    private Long id;
    private String name;
    private String content;

    public Accounts() {}

    public Accounts(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }
}
