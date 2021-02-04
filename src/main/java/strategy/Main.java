package strategy;


import strategy.tank.Fire;
import strategy.tank.OneFire;
import strategy.tank.Tank;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ryh
 * @Description: 主线程类
 * @date 2021/1/2610:13 上午
 */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //comparable接口测试
//        Human[] humans = new Human[3];
//        humans[0] = new Human(5, "zhangsan");
//        humans[1] = new Human(3, "lisi");
//        humans[2] = new Human(4, "wangwu");
//        
//        Arrays.sort(humans);
//
//        for (Human human : humans) {
//            System.out.println(human);
//
//        }   
        //comparator接口测试
//        People[] peoples = new People[3];
//        peoples[0] = new People(3, "zhangsan");
//        peoples[1] = new People(4, "lisi");
//        peoples[2] = new People(5, "wangwu");
//        //上下文环境，客户端可以通过同一个接口使用不同的策略
//        Arrays.sort(peoples, (o1, o2) -> {
//            if (o1.getName().charAt(0) < o2.getName().charAt(0)) return -1;
//            else if (o1.getName().charAt(0) > o2.getName().charAt(0)) return 1;
//            return 0;
//        });


//        System.out.println(Arrays.toString(peoples));
        
        //tank开火策略类测试
        Tank tank = new Tank();
        tank.tank(new OneFire());
        tank.tank(()-> System.out.println("无敌biubiubiu"));


    }
}
