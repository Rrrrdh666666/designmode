package decorator;

/**
 * @author ryh
 * @Description: 手机装饰类
 * @date 2021/2/410:20 上午
 */

/**
 * 装饰类必须继承自核心类，
 * 1.用来提供入口对核心类进行装饰,通过构造函数得到装饰前的对象(可能已经被装饰过)
 * 2.重写call方法，来对装饰之前的call方法进行调用
 * 3.具体增强由装饰类子类方法决定
 */

public abstract class PhoneDecorator implements Phone{
    private Phone phone;

    public PhoneDecorator(Phone phone){
        this.phone = phone;
    }

    @Override
    public void call(){
        phone.call();
    }

}
