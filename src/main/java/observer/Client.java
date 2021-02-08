package observer;

/**
 * @author ryh
 * @Description: 客户端
 * @date 2021/2/710:56 上午
 */
/**
 *实现每次修改weatherData中的数据，web和card 的展示数据都跟着动态变化。
 */

/**
 * 观察者实现的两种方式
 * 1.通过 被观察者 即 weatherDate.registerObserver(观察者)进行注入绑定
 *   通过 被观察者 即 weatherDate.notifyObserver(参数)进行消息通知，动态更改数据
 *   但是这种方式不利于扩展，notifyObserver(参数)修改会影响所有相关类的修改
 * 2.每个观察者类中维持同一个被观察者类，通过构造方法注入
 *   数据更新具体到每个观察者的update()方法中进行，拓展性好，耦合性低。
 */
public class Client {

    public static void main(String[] args) {
        //被观察者
        WeatherData weatherData = WeatherData.getInstance();
        //绑定观察者
        DisplayCard displayCard = new DisplayCard(weatherData);
        DisplayWeb displayWeb = new DisplayWeb(weatherData);

        displayCard.display();
        displayWeb.display();
        weatherData.renewDate("上海","晴","22.8");
        displayCard.display();
        displayWeb.display();
//        weatherData.detachObserver(displayCard);
        weatherData.renewDate("北京","阴天","-7");
        displayCard.display();
        displayWeb.display();


    }

}
