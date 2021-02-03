package strategy.tank;

/**
 * @author ryh
 * @Description: 具体策略实现类单发
 * @date 2021/2/14:29 下午
 */
public class OneFire implements Fire {
    @Override
    public void fire() {
        System.out.println("单发.......");
    }
}
