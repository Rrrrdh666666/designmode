package strategy;

/**
 * @author ryh
 * @Description: 对比
 * @date 2021/1/2710:28 下午
 */


/**
 * comparable实现自定义类排序，每个类只有实现接口才能进行排序
 * 自定义排序 如果操作其他，则不能比较
 * 接口comparator 进行优化
 */

public class Human implements Comparable<Human> {//

    private int age;
    private String name;


    @Override
    public int compareTo(Human o) {
        Human human = o instanceof Human ? ((Human) o) : null;
        if(this.age < human.age ) return -1;
        else if (this.age > human.age) return 1;
        return 0;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
