package factory.factorymethod;

/**
 * @author ryh
 * @Description: 拉面工厂
 * @date 2021/2/32:12 下午
 */
public class LaMianFactory extends NoodlesFactory {
    @Override
    public Noodles create() {
        return new LaMian();
    }
}
