package strategy;

import java.util.Comparator;

/**
 * @author ryh
 * @Description: 利用策略模式优化
 * @date 2021/1/2710:57 下午
 */

public class People {

    private int age;
    private String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
