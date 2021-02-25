package adapt.classtype;

/**
 * @author ryh
 * @Description: 被适配类，即不满足要求，需要通过适配器转换的类
 * @date 2021/2/1810:36 上午
 */
public abstract class ClassAdapted {

    public void voltage220V(){
        System.out.println("输出220v电流...");
    };
}
