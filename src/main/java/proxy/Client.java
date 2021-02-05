package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.dynamic.cglib.Core;
import java.lang.reflect.Method;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/24:40 下午
 */

/**
 * 静态代理是自己手写代理，在编译期间就已经确定对哪个类代理
 * 动态代理：不知道具体对哪个类增强，程序运行是才能确定
 * jdk动态代理  proxy帮你生成代理类，被代理必须有接口才可以实现，通过反射实现
 * cjlib动态代理：通过底层字节码文件实现，相当于构造一个被代理对象的子类对象，重写方法增强代理
 *              被代理类不必须要接口，但不能被fianl修饰
 */

/**
 * 静态代理每个类都需要一个代理类去代理
 * jdk动态代理通过invocationhandler,对一系列方法进行一个模式的代理，生成一个proxy代理类
 * cglib动态代理 通过methodinterceptor进行方法拦截
 * 生成3个class  代理类  fastclass1 fastclass2 使用invoke会产生循环调用问题
 */
public class Client {
    public static void main(String[] args) {
//        staticproxy例子
//        SportsMan agent = new BasketballAgent();
//        agent.sport();
//        jdk
//        Jay jay = new Jay();
//        StarHandler starHandler = new StarHandler(jay);
//        StarMan starMan = (StarMan) starHandler.creatProxy();
//        System.out.println(starMan);
//
//        starMan.dance();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Core.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("打印日志");
                //死循环问题
                System.out.println(method.getName());
                Object o1 = methodProxy.invokeSuper(o, objects);
//                Object o1 = methodProxy.invoke(o, objects);
                System.out.println("程序执行结束");
                return o1;
            }
        });
        Core core = (Core) enhancer.create();
        core.core();
        System.out.println("测试");

    }
}
