package singleton;

/**
 * @author ryh
 * @Description: 懒汉式
 * @date 2021/1/258:45 下午
 */

/**
 * 多线程环境下效率低，时间换空间
 */
public class SingletonLH {

    private static SingletonLH INSTANCE;

    private SingletonLH(){};

    //synchronized 保证单例
    public static synchronized SingletonLH getInstance(){
        if(null == INSTANCE){
            return  new SingletonLH();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {

        System.out.println(INSTANCE);

        SingletonLH instance1 = SingletonLH.getInstance();
        SingletonLH instance2 = SingletonLH.getInstance();
        System.out.println(instance1);

        System.out.println(instance1 == instance2);

    }
}
