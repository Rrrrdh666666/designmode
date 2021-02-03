package singleton;

/**
 * @author ryh
 * @Description: 枚举测试
 * @date 2021/1/259:44 下午
 */
public enum EnumTest {
    MONDAY;
    
}

class test{
     public static void main(String[] args) {

         EnumTest monday = EnumTest.MONDAY;
         System.out.println(monday);

     }
}
