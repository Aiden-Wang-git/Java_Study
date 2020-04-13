package day_33;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-04-13 11:04
 */
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(int age,String name ) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("这是静态代码块！");
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

    public void funtion(){
        System.out.println("人吃饭！");
    }

    public void sleep(String name,int age,int time){
        System.out.println(name+","+age+"岁，"+"睡了"+time+"个小时。");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
