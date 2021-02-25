package adapt;

import adapt.objecttype.ObjectAdapted;
import adapt.objecttype.ObjectAdaptor;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/710:56 上午
 */

/**
 * 描述
 * Machine需要110v电压才能工作
 * 现在已有类提供220V电压
 * 通过适配器模式，在不改变客户端和已有类的基础上，对电压进行转换
 *
 */

/**
 * 适配器模式分为
 * 1.类适配：通过继承实现
 * 2.对象适配：通过委派实现
 */
public class Client {
    public static void main(String[] args) {
        //        类适配
//        new Machine().work(new ClassAdaptor());
        new Machine().work(new ObjectAdaptor(new ObjectAdapted()));
    }

}

class Machine{

    void work(ITarget voltage){
        voltage.voltage110V();
        System.out.println("电力适配，工作启动");

    }


}
