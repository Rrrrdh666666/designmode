package prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ryh
 * @Description:
 * @date 2021/2/2610:38 上午
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Teacher teacher;

}
