package decorator;

/**
 * @author ryh
 * @Description: 小米手机
 * @date 2021/2/410:19 上午
 */
public class XiaoMiPhone implements Phone {

    @Override
    public void call() {
        System.out.println("小米手机通话中");

    }
}
