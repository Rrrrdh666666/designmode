package strategy.tank;

import java.security.PublicKey;

/**
 * @author ryh
 * @Description: 策略上下文
 * @date 2021/2/14:32 下午
 */
public class Tank implements Cloneable{


    public void tank(Fire fire){

        System.out.println("组装");
        fire.fire();
        System.out.println("胜利");
    }

}
