package proxy.staticproxy;

import proxy.staticproxy.BasketballPlayer;
import proxy.staticproxy.SportsMan;

/**
 * @author ryh
 * @Description: 经纪人，篮球代理类
 * @date 2021/2/43:21 下午
 */

/**
 * 代理类，负责对外提供接口，并加入被代理类无法完成的方法
 */
public class BasketballAgent implements SportsMan {
    private SportsMan realPlayer;

    public  BasketballAgent(){
        realPlayer = new BasketballPlayer();
    }

    //代理类要做的事情
    public void getMoney(){
        System.out.println("收钱，通知打球");
    }

    //代理类要做的事情
    public void shareMoney(){
        System.out.println("分钱，大家开开心心");
    }


    @Override
    public void sport() {
        getMoney();
        realPlayer.sport();
        shareMoney();
    }
}
