package proxy.staticproxy;

import proxy.staticproxy.SportsMan;

/**
 * @author ryh
 * @Description: 篮球运动员
 * @date 2021/2/43:19 下午
 */

/**
 * 被代理类，负责核心业务执行
 */
class BasketballPlayer implements SportsMan {

    @Override
    public void sport() {
        System.out.println("我负责打篮球");
    }
}
