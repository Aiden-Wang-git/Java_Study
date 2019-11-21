package day_20;

import java.util.*;

/**
 * ClassName:Test
 * Package:day_20
 * Description:
 *
 * @date:2019/11/21 14:24
 * @author:Wang Jun
 */
public class Test {
    public static void main(String[] args) {
        int sum1 = getSum(1, 3, 5, 35, 23, 133, 4);
        int sum2 = getSum(34, 52, 25, 2);
        int sum3 = getSum();
        System.out.println(sum1 + "," + sum2 + "," + sum3);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(23);
        list.add(42);
        list.add(23);
        list.add(1);
        list.add(23);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,4));
        MapMap();
    }

    public static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void MapMap(){
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<String,Map<String,String>> map = new HashMap<>();
        map1.put("001","张三");
        map1.put("002","李四");
        map2.put("003","王五");
        map2.put("004","赵六");
        map.put("Java基础班",map1);
        map.put("Java就业班",map2);
        System.out.println(map);
        for (Map.Entry<String,Map<String,String>> entry : map.entrySet()){
            System.out.println("班级为："+entry.getKey());
            for (Map.Entry<String,String> entry1 : entry.getValue().entrySet()){
                System.out.println("学号为："+entry1.getKey()+",姓名为："+entry1.getValue());
            }
        }

    }
}
