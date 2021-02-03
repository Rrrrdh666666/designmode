package singleton;

/**
 * @author ryh
 * @Description: 枚举单例
 * @date 2021/1/259:04 下午
 */

/**
 * 出自effective java
 *
 * 1.简单
 * 2.可以防止反序列化 enum
 */
public enum SingletonEM {
    INSTANCE;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(SingletonEM.INSTANCE.hashCode());
            }).start();
        }
    }
}
