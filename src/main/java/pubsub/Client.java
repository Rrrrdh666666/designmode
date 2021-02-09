package pubsub;

/**
 * @author ryh
 * @Description: 客户端测试类
 * @date 2021/2/82:32 下午
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        int processors = Runtime.getRuntime().availableProcessors();
//        System.out.println(processors);
        
        SubPubCentral instance = SubPubCentral.getInstance();

        Publish1 publish1 = new Publish1(instance);
        Publish2 publish2 = new Publish2(instance);

        instance.register(publish1);
        instance.register(publish2);

        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();
        Subscriber3 subscriber3 = new Subscriber3();

        instance.subscriber(publish1,subscriber1);
        instance.subscriber(publish2,subscriber1);
        instance.subscriber(publish2,subscriber2);
        instance.subscriber(publish1,subscriber3);


        publish1.publishMessage("我是1发出来的消息");
        publish2.publishMessage("啦啦啦啦啦啦啦啦啦");


    }
}
