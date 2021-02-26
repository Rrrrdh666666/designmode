package prototype;

import com.google.gson.Gson;
import prototype.deep.Student;
import prototype.deep.Teacher;

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
//        Programmer programmer = new Programmer("任宇辉", new Computer("mac", 200000));
//        Programmer clone = (Programmer)programmer.clone();
//        System.out.println(programmer);
//        System.out.println(clone);
//
//        programmer.setName("任淑苹");
//        programmer.getComputer().setPrice(1000000000);
//        System.out.println(programmer.getComputer() == clone.getComputer());
//        System.out.println(programmer.getComputer());
//        System.out.println(clone.getComputer());

        //深克隆(序列化深克隆)
        Student student = new Student("任宇辉", new Teacher("香香", 49));
        Gson gson = new Gson();
        String s = gson.toJson(student);
        Student clone = gson.fromJson(s,Student.class);
        System.out.println(student);
        System.out.println(clone);
        student.setName("任淑苹");
        student.getTeacher().setName("臭臭");
        System.out.println(student.getTeacher());
        System.out.println(clone.getTeacher());


    }

}
