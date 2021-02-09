package pubsub;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ryh
 * @Description: 消息发布类2
 * @date 2021/2/85:16 下午
 */
public class Publish2 extends Publish {

    private String type = this.getClass().getName();
    private SubPubCentral subPubCentral;

    public Publish2(SubPubCentral subPubCentral){
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
