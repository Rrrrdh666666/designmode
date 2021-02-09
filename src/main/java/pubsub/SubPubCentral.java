package pubsub;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ryh
 * @Description: 订阅中心
 * @date 2021/2/82:55 下午
 */
public class SubPubCentral {

    //订阅中心配置
    private static ConcurrentHashMap<String, Set<String>> subPubCentral = new  ConcurrentHashMap<>();

    private static SubPubCentral INSTANCE = new SubPubCentral();

    public boolean register(Publish publish){
        //校验
        if(null == publish || null == publish.getType()){
            return false;
        }
        //注册
        boolean containsKey = subPubCentral.containsKey(publish.getType());
        if(!containsKey){
            HashSet<String> subscribers = new HashSet<>();
            subPubCentral.put(publish.getType(),subscribers);
        }
        return true;
    }

    //订阅者绑定发布者
    public boolean subscriber(Publish publish,Subscriber subscriber){
        //校验
        if(null == publish || null == subscriber || null == publish.getType() || null == subscriber.getType()){
            return false;
        }
        //关联订阅
        boolean containsKey = subPubCentral.containsKey(publish.getType());
        if(containsKey){
            Set<String> subscribers = subPubCentral.get(publish.getType());
            subscribers.add(subscriber.getType());
            subPubCentral.put(publish.getType(),subscribers);
            return true;
        }
        return false;
    }

    //发布订阅消息
    public boolean publish(Publish publish,String message) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        if(null == publish || null == publish.getType() || null == message ){
           return false;
        }
        boolean containsKey = subPubCentral.containsKey(publish.getType());
        if(containsKey){
            Set<String> subscribers = subPubCentral.get(publish.getType());
            if(null == subscribers ||0 == subscribers.size()){
                return true;
            }
            for (String subscriber : subscribers) {
                Class<?> aClass = Class.forName(subscriber);
                Method receiveMessage = aClass.getMethod("receiveMessage", String.class);
                receiveMessage.invoke(aClass.newInstance(),message);
            }
        }
        return false;

    }

    //单例模式 提供唯一消息中心
    private SubPubCentral(){}

    public static SubPubCentral getInstance(){
        return INSTANCE;
    }


}
