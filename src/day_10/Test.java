package day_10;

/**
 * ClassName:Test
 * Package:day_10
 * Description:
 *
 * @date:2019/10/20 13:00
 * @author:2858600511@qq.com
 */
public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.eat();
        if(a1 instanceof Cat)
            System.out.println("a1 is Cat");
        Cat cat1 = (Cat)a1;
        if(cat1 instanceof Cat)
            System.out.println("cat1 is Cat");
        cat1.catchMouse();
    }
}
