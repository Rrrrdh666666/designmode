package prototype;

import com.google.gson.Gson;
import prototype.deep.Computer;
import prototype.deep.Programmer;

/**
 * @author ryh
 * @Description: 原型(克隆)模式客户端
 * @date 2021/2/194:49 下午
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
//        User userO = new User(18, "任宇辉");
//        User userN = (User)userO.clone();
//
//        System.out.println(userO.getAge() == userN.getAge());
//        System.out.println(userO.getName() == userN.getName());
//
//        userO.setAge(20);
//        userN.setName("任淑苹");
//
//        System.out.println(userO.getAge() == userN.getAge());
//        System.out.println(userO.getName() == userN.getName());
        //深克隆(套娃克隆)
        Programmer programmer = new Programmer("任宇辉", new Computer("mac", 200000));
//        Programmer clone = (Programmer)programmer.clone();
        //深克隆(序列化深克隆)
        Gson gson = new Gson();
        String s = gson.toJson(programmer);
        Programmer clone = gson.fromJson(s, Programmer.class);

        System.out.println(programmer);
        System.out.println(clone);

        programmer.setName("任淑苹");
        programmer.getComputer().setPrice(1000000000);
        System.out.println(programmer.getComputer() == clone.getComputer());
        System.out.println(programmer.getComputer());
        System.out.println(clone.getComputer());

    }

}
