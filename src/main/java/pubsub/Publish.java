package pubsub;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ryh
 * @Description: 发布类基类
 * @date 2021/2/83:55 下午
 */

public abstract class Publish {

    abstract String getType();

    abstract void publishMessage(String message) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
