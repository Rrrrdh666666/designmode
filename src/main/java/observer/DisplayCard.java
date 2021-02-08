package observer;

/**
 * @author ryh
 * @Description: 观察者实现类
 * @date 2021/2/711:17 上午
 */
public class DisplayCard implements Observer {

    private String city;
    private String weather;
    private String temperature;

    private WeatherData weatherData;

    public DisplayCard(WeatherData weatherData){
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.city = weatherData.getCity();
        this.weather = weatherData.getWeather();
        this.temperature = weatherData.getTemperature();
    }
    public void display(){
        System.out.println("展示板发布:");
        System.out.println("city:" + city + ",weather:" + weather + ",temperature:" + temperature);
    }
}
