package pubsub;

/**
 * @author ryh
 * @Description: 消息订阅者1
 * @date 2021/2/85:29 下午
 */
public class Subscriber1 extends Subscriber {
    
    private String type = this.getClass().getName();
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("订阅者1：");
        System.out.println(message);

    }
}
