package decorator;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/24:40 下午
 */

/**
 * 核心类和装饰类
 * 核心类负责核心业务 装饰类负责装饰功能  利用多态，继承进行核心功能的多次增强。
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new XiaoMiPhone();
        phone.call();
        phone = new MusicDecorator(phone);
        phone.call();
        phone = new MessageDecorator(phone);
        phone.call();

    }
}
