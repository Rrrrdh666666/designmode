package decorator;

/**
 * @author ryh
 * @Description: 铃声装饰
 * @date 2021/2/410:23 上午
 */
public class MessageDecorator extends PhoneDecorator {

    public MessageDecorator(Phone phone) {
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
