package factory.simple;

/**
 * @author ryh
 * @Description: 面条工厂类
 * @date 2021/2/310:21 上午
 */

/**
 * 通俗的说，方法的返回值为类的类都算工厂类
 * 简单工厂：
 * 1.封装具体实现类创建过程，一切交由工厂创建
 * 2.客户端根据api实现具体实现类的创建
 *
 * 优点：简单
 * 缺点：每新增加一个具体实现，工厂类都需要修改，不符合开闭原则
 */
public class NoodlesFactory{
      //初稿
    public final static int LAMIAM  = 1;
    public final static int FANGBIANMIAN  = 2;

    public static Noodles create(int type){
       switch (type){
           case 1:
               return new LaMian();
           case 2:
               return new FangBianMian();
       }
        return null;
    }

    //优化
    //仍有缺点，对初始化较为复杂的对象不适用
    public static Noodles create(Class<? extends Noodles> noodles){

        try {
            if(null != noodles){
                return noodles.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
