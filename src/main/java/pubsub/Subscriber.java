package pubsub;

/**
 * @author ryh
 * @Description: 订阅类基类
 * @date 2021/2/83:57 下午
 */

public abstract class Subscriber {

    abstract String getType();

    abstract void receiveMessage(String message);
}
