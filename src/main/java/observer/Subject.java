package observer;

/**
 * @author ryh
 * @Description: subject类，即被观察类，若有改变通知观察者类
 * @date 2021/2/710:57 上午
 */
public interface Subject {
    //注册观察者
    boolean registerObserver(Observer observer);
    //移除观察者
    boolean detachObserver(Observer observer);
    //通知观察者
    void notifyObserver();
}
