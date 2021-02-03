package singleton; /**
 * @author ryh
 * @Description: 单列设计模式
 * @date 2021/1/25 8:16 下午
 */
/**
 * 设计原则：
 * 1.单例类只能有一个实例。
 * 2.单例类必须自己创建自己的唯一实例，并提供唯一入口。
 * 3.单例类必须给所有其他对象提供这一实例。
 */
/**
 * 应用场景
 * 1.用作固定缓存
 * 2.配置文件读取
 * 3.连接池
 */

/**
 * 饿汉式
 * 操作简单，实用，初始化即单例化，线程安全。
 */
public class SingletonEH {

    //满足设计1，单例类只能有一个实例
    private final static SingletonEH INSTANCE = new SingletonEH();
    
    //满足设计3，单例类必须给所有其他对象提供这一实例
    public static SingletonEH getInstance(){
        return INSTANCE;
    };

    //满足设计2.单例类必须自己创建自己的唯一实例，并提供唯一入口
    private SingletonEH(){};




    public static void main(String[] args) {

        SingletonEH singletonEH1 = SingletonEH.getInstance();
        SingletonEH singletonEH2 = SingletonEH.getInstance();
        System.out.println(singletonEH1 == singletonEH2);

    }
}
