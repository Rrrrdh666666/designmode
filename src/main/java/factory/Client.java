package factory;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/39:35 上午
 */

import factory.abstractfactory.StarFactory;
import factory.abstractfactory.XiaoChiFactory;
import factory.factorymethod.FangBianMianFactory;
import factory.factorymethod.LaMianFactory;
import factory.factorymethod.Noodles;
import factory.factorymethod.ShengChaoMianFactory;
import factory.simple.NoodlesFactory;


/**
 * 面向具体物（名次）抽象
 * 面向部件（形容词）接口
 * 工厂模式：解耦，客户只需要关心对象的创建，工厂统一管理创建过程，适用于某些类的创建较为复杂的场景
 *
 * 方法public 可以调用方法
 */
public class Client {
    public static void main(String[] args) {
//          1。简单工厂设计
//        Noodles noodles = NoodlesFactory.create(NoodlesFactory.FANGBIANMIAN);
//        noodles.desc();
//        Noodles noodles1 = NoodlesFactory.create(NoodlesFactory.LAMIAM);
//        noodles1.desc();
//            2.工厂方法设计，关注一类型产品
//        Noodles noodles = new FangBianMianFactory().create();
//        noodles.desc();
//
//        Noodles noodles1 = new LaMianFactory().create();
//        noodles1.desc();

//        新的面食产品与之前的面食产品解耦，无需修改之前的代码
//        Noodles noodles2 = new ShengChaoMianFactory().create();
//        noodles2.desc();

//        3.抽象工厂设计，关注一类产品族
        //是工厂方法的拓展，工厂方法关心单一产品，抽象工厂关系一类产品族
        //工厂方法的核心是工厂，所有的对象创造逻辑都在工厂
//        XiaoChiFactory xiaoChiFactory = new XiaoChiFactory();
//        xiaoChiFactory.vegetable().desc();
//        xiaoChiFactory.stapleFood().desc();
//        xiaoChiFactory.soup().desc();
//
//        System.out.println("===============================================================");
//
//        StarFactory starFactory = new StarFactory();
//        starFactory.vegetable().desc();
//        starFactory.stapleFood().desc();
//        starFactory.soup().desc();
    }
}
