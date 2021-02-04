package decorator;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/24:40 下午
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 核心类和装饰类
 * 核心类负责核心业务 装饰类负责装饰功能  利用多态，继承进行核心功能的多次增强。
 *
 * 与代理模式区别
 * 1.装饰者可以无线递归的装饰某一类产品；代理者模式侧重于对功能以外的功能进行增强
 * 2.客户端使用装饰者模式必须显示的知道被装饰的类；代理模式可以隐藏核心功能类，提供代理接口；
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
