package prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ryh
 * @Description: 用户
 * @date 2021/2/194:50 下午
 */
@Data
@AllArgsConstructor
public class User implements Cloneable {
    private int age;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
