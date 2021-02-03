package factory.abstractfactory;

/**
 * @author ryh
 * @Description: 星级餐厅
 * @date 2021/2/33:07 下午
 */

public class StarFactory extends RestaurantFactory {
    @Override
    public Food stapleFood() {
        return new Rice();
    }

    @Override
    public Vegetable vegetable() {
        return new Cherry();
    }

    @Override
    public Soup soup() {
        return new Coar();
    }
}
