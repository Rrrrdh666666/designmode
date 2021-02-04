package proxy.dynamic.jdk;

/**
 * @author ryh
 * @Description: 篮球运动员
 * @date 2021/2/43:19 下午
 */

/**
 * 被代理类，负责核心业务执行
 */
public class Jay implements StarMan {

    @Override
    public void singing() {
        System.out.println("为你弹奏萧邦的夜曲");
    }

    @Override
    public void dance() {
        System.out.println("跳机械舞，当当当");

    }
}
