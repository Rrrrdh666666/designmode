package factory.factorymethod;

/**
 * @author ryh
 * @Description: 方便面工厂
 * @date 2021/2/32:11 下午
 */

public class FangBianMianFactory extends NoodlesFactory{
    @Override
    public Noodles create() {
        return new FangBianMian();
    }
}
