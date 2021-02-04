package proxy;

import proxy.dynamic.jdk.Jay;
import proxy.dynamic.jdk.StarHandler;
import proxy.dynamic.jdk.StarMan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/24:40 下午
 */
public class Client {
    public static void main(String[] args) {
//        staticproxy例子
//        SportsMan agent = new BasketballAgent();
//        agent.sport();

        Jay jay = new Jay();
        StarHandler starHandler = new StarHandler(jay);
        StarMan zjl = (StarMan)Proxy.newProxyInstance(jay.getClass().getClassLoader(),
                jay.getClass().getInterfaces(),starHandler);
//        zjl.singing();
        zjl.dance();
    }
}
