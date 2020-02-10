package day_25;

import java.io.Serializable;

/**
 * @program: Java_Test
 * @description: 人类
 * @author: Wang Jun
 * @create: 2020-02-09 15:00
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private static final long  serialVersionUID = 45646L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
