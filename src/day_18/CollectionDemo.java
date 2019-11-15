package day_18;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:CollectionDemo
 * Package:day_18
 * Description:
 *
 * @date:2019/11/12 14:00
 * @author:Wang Jun
 */
public class CollectionDemo {
    public static void main(String[] args) {
//        function1();
//        function2();
//        function3();
        function4();
    }

    public static void function1(){
        Collection<String> list = new ArrayList<>();
        list.add("001");
        list.add("002");
        list.add("003");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        System.out.println(list.contains("aaa"));
        Object[] strings = list.toArray();
        for (Object i :strings)
            System.out.println(i);
        list.remove("aaa");
        System.out.println(list);
    }

    public static void function2(){
        Collection<String> list = new ArrayList<>();
        list.add("000");
        list.add("111");
        list.add("222");
        list.add("333");
        System.out.println(list);
        System.out.println("==============");
        Iterator<String> it = list.iterator();
        String string;
        while (it.hasNext()){
            string = it.next();
            System.out.println(string);
            it.remove();
        }
        System.out.println("=============");
        System.out.println(list);
    }

    public static void function3(){
        Collection<Person> list = new ArrayList<>();
        list.add(new  Person("张一",41));
        list.add(new Person("张二",12));
        list.add(new Person("张三",13));
        for (Person person : list)
            System.out.println(person);
    }

    public static void function4(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        Integer[] i = new Integer[list.size()];
        Integer[] j = list.toArray(i);
        for (Integer integer :j)
            System.out.println(integer);
    }
}
