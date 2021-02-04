package decorator;

/**
 * @author ryh
 * @Description: 短信手机
 * @date 2021/2/411:03 上午
 */
public class MessagePhone extends PhoneDecorator {

    public MessagePhone(Phone phone) {
        super(phone);
    }

    private void message(){
        System.out.println("手机发送短信");
    }

    @Override
    public void call(){
        message();
        super.call();
    }
}
