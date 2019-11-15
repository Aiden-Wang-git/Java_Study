package day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ListDemo
 * Package:day_19
 * Description:
 *
 * @date:2019/11/14 20:44
 * @author:Wang Jun
 */
public class ListDemo {
    public static void main(String[] args) {
        function1();
    }

    public static void function1() {
        List<String> list = new ArrayList<>();
        list.add("001");
        list.add("002");
        list.add("003");
        list.add("004");
        list.add("005");
        System.out.println(list);
        list.add(1, "新加入");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
    }
}
