package factory.abstractfactory;

/**
 * @author ryh
 * @Description: 小吃工厂类
 * @date 2021/2/33:06 下午
 */
public class XiaoChiFactory extends RestaurantFactory {
    @Override
    public Food stapleFood() {
        return new Wowotou();
    }

    @Override
    public Vegetable vegetable() {
        return new ShengCai();
    }

    @Override
    public Soup soup() {
        return new Coar();
    }
}
