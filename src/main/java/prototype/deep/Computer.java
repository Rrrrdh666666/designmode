package prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ryh
 * @Description:
 * @date 2021/2/195:00 下午
 */
@Data
@AllArgsConstructor
public class Computer implements Cloneable{

    private String type;
    private int price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
