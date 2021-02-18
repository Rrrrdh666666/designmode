package decorator;

/**
 * @author ryh
 * @Description: 短信手机
 * @date 2021/2/411:03 上午
 */
public class MusicDecorator extends PhoneDecorator {

    public MusicDecorator(Phone phone) {
        super(phone);
    }

    private void ring(){
        System.out.println("铃声响叮叮叮叮叮");

    }
    @Override
    public void call(){
        ring();
        super.call();
    }
}
