package adapt.objecttype;

import adapt.ITarget;

/**
 * @author ryh
 * @Description: 适配器类
 * @date 2021/2/1810:37 上午
 */
public class ObjectAdaptor implements ITarget {

    private ObjectAdapted adapted;

    public ObjectAdaptor(ObjectAdapted adapted){
        this.adapted = adapted;

    }
    @Override
    public void voltage110V() {
        adapted.voltage220V();
        System.out.println("对220v电流进行操作，输出110v");
    }
}
