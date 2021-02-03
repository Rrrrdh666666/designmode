package singleton;

/**
 * @author ryh
 * @Description: 静态内部类的写法
 * @date 2021/1/259:09 下午
 */

/**
 * 利用静态内部类的懒加载，只有在第一次使用时才会加载。
 *
 * 内部类有外部类的引用，内部类可以访问外部类的数据，外部类访问内部类需要初始化内部类。
 *
 *
 */
public class SingletonP {

    private SingletonP(){};

    private static class SingletonPInstance{
        private final  static SingletonP INSTANCE = new SingletonP();

        public void test(){};
    }

    public static SingletonP getInstance(){

//        new SingletonPInstance().test();

        return SingletonPInstance.INSTANCE;
    }
}
