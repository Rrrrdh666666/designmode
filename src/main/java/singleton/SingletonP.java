package singleton;

/**
 * @author ryh
 * @Description: 静态内部类的写法
 * @date 2021/1/259:09 下午
 */

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用静态内部类的懒加载，只有在第一次使用时才会加载。
 *
 * 内部类有外部类的引用，内部类可以访问外部类的数据，外部类访问内部类需要初始化内部类。
 *
 *
 */
public class SingletonP implements Serializable {

    //反射破坏
    private SingletonP(){
        if(null != SingletonPInstance.INSTANCE){
            throw new RuntimeException("该实例已经存在");
        }
    };

    private static class SingletonPInstance{
        private final  static SingletonP INSTANCE = new SingletonP();

//        public void test(){};
    }

    public static SingletonP getInstance(){

//        new SingletonPInstance().test();

        return SingletonPInstance.INSTANCE;
    }

    //序列化破坏
    private Object readResolve(){
        return SingletonPInstance.INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //反射破坏
//        Class<?> singletonPClass = SingletonP.class;
//        Constructor c = singletonPClass.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        Object o = c.newInstance();
//        Object o1 = c.newInstance();
//        System.out.println(o == o1);

        //序列化破坏
        SingletonP s1 = null;
        SingletonP s2 = SingletonP.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("singletonP.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("singletonP.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SingletonP)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);

            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
