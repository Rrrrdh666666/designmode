package factory.factorymethod;

/**
 * @author ryh
 * @Description: 生炒面工厂
 * @date 2021/2/32:24 下午
 */
public class ShengChaoMianFactory extends NoodlesFactory {
    @Override
    public Noodles create() {
        return new ShengChaoMian();
    }
}
