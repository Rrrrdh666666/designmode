package factory.factorymethod;

/**
 * @author ryh
 * @Description: 面条工厂类
 * @date 2021/2/310:21 上午
 */

/**
 * 工厂方法是对简单工厂缺点的优化：
 * 每次添加新的产品都要修改工厂，违反开闭原则
 * 改良：定义一个抽象工厂类，将每类产品的生产职责下沉到具体的工厂类，每个具体的工厂对具体产品进行管理
 *
 * 工厂方法针对单一产品进行管理
 * 抽象工厂针对组合产品进行管理
 *
 *
 */
public abstract class NoodlesFactory{
    public abstract  Noodles create();
}
