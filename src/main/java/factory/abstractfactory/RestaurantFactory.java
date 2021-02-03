package factory.abstractfactory;

/**
 * @author ryh
 * @Description: 餐厅工厂类
 * @date 2021/2/32:57 下午
 */
abstract class RestaurantFactory {
    public abstract Food stapleFood();
    public abstract Vegetable vegetable();
    public abstract Soup soup();
}
