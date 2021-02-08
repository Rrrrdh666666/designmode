package observer;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ryh
 * @Description: 实际的观察者类
 * @date 2021/2/711:06 上午
 */
public class WeatherData extends Subject{

    private String city;
    private String weather;
    private String temperature;
    //维护一个单例集合
    private static CopyOnWriteArrayList<Observer> OBSERVERS = new CopyOnWriteArrayList<>();

    //单例存在
    private static WeatherData INSTANCE = new WeatherData();
    private WeatherData(){};

    public static WeatherData getInstance(){
        return INSTANCE;
    }
    @Override
    public boolean registerObserver(Observer observer) {
        return OBSERVERS.add(observer);
    }
    @Override
    public boolean detachObserver(Observer observer) {
        return OBSERVERS.remove(observer);
    }

    @Override
    void notifyObserver() {
        for (Observer observer : OBSERVERS) {
              observer.update();
        }
    }

    //具体实现方法
    public synchronized void renewDate(String city,String weather,String temperature){
        this.city = city;
        this.weather = weather;
        this.temperature = temperature;
        notifyObserver();
    }

    public String getCity() {
        return city;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperature() {
        return temperature;
    }


}
