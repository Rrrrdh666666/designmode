package pubsub;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ryh
 * @Description: 消息发布类1
 * @date 2021/2/85:16 下午
 */
public class Publish1 extends Publish {

    //唯一标识，用于订阅中心区分并找到这个实例,此处只是实验
    private String type = this.getClass().getName();
    private SubPubCentral subPubCentral;

    public Publish1(SubPubCentral subPubCentral){
        this.subPubCentral = subPubCentral;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void publishMessage(String message) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        subPubCentral.publish(this,message);
    }
}
