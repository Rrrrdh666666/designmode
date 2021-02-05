package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ryh
 * @Description: 处理类
 * @date 2021/2/44:08 下午
 */
public class StarHandler implements InvocationHandler {

    private Object star;

    public StarHandler(Object star){
        this.star = star;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("singing")){
            System.out.println("唱歌收费1000");
            method.invoke(star,args);
        }
        if(method.getName().equals("dance")){
            System.out.println("免费跳舞");
            method.invoke(star,args);
        }
        return proxy;
    }

    public Object creatProxy(){
        return Proxy.newProxyInstance(star.getClass().getClassLoader(),star.getClass().getInterfaces(),this);
    }
}
