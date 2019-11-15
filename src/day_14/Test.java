package day_14;

/**
 * ClassName:Test
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 15:23
 * @author:2858600511@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        use(animal);
        ((Dog)get()).run();
    }

    public static void use(Animal animal){
        animal.eat();
    }

    public static Animal get(){
        return new Dog();
    }

}
