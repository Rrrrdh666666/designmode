package decorator;

/**
 * @author ryh
 * @Description: 铃声装饰
 * @date 2021/2/410:23 上午
 */
public class MusicPhone extends PhoneDecorator {

    public MusicPhone(Phone phone) {
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
