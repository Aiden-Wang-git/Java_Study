package day_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:MapDemo
 * Package:day_20
 * Description:
 *
 * @date:2019/11/20 19:43
 * @author:Wang Jun
 */
public class MapDemo {
    public static void main(String[] args) {
//        function1();
//        function2();
        function3();
    }


    public static void function1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("a", 5);
        System.out.println(map);
        Integer a = map.remove("c");
        System.out.println(a);
        map.put("c", 3);
        map.put("d", 6);
        System.out.println(map);
        Set<String> set = map.keySet();
        for (String string : set) {
            System.out.println(map.get(string));
        }
        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            System.out.println("key值为：" + entry.getKey() + ",value值为：" + entry.getValue());
        }


    }

    public static void function2() {
        Map<String, Person> map = new HashMap<>();
        map.put("001", new Person("Tom", 15));
        map.put("002", new Person("Bob", 17));
        map.put("003", new Person("Tina", 55));
        map.put("004", new Person("King", 5));
        map.put("005", new Person("Jan", 65));
        for (String key :map.keySet())
            System.out.println(map.get(key));
    }

    public static void function3(){
        Person p1 = new Person("a",1);
        Person p2 = new Person("a",1);
        System.out.println(p1.equals(p2));
    }
}
