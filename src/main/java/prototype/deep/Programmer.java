package prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author ryh
 * @Description: 程序员类
 * @date 2021/2/194:59 下午
 */
@Data
@AllArgsConstructor
@ToString
public class Programmer implements Cloneable{

    private String name;
    private Computer computer;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Programmer programmer = (Programmer)super.clone();
        programmer.computer = (Computer)this.computer.clone();
        return programmer;
    }
}
