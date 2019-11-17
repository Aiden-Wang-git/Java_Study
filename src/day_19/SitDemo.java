package day_19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:SitDemo
 * Package:day_19
 * Description:
 *
 * @date:2019/11/17 20:20
 * @author:Wang Jun
 */
public class SitDemo {
    public static void main(String[] args) {
        function1();
    }

    public static void function1() {
        Set<String> set = new HashSet<>();
        set.add("001");
        set.add("AS");
        set.add("0DSA");
        set.add("0AD4");
        set.add("005");
        //无序
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            String string = iterator1.next();
            System.out.println(string);
        }
    }
}
