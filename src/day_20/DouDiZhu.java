package day_20;

import javax.crypto.interfaces.PBEKey;
import java.util.*;

/**
 * ClassName:DouDiZhu
 * Package:day_20
 * Description:
 *
 * @date:2019/11/21 15:39
 * @author:Wang Jun
 */
public class DouDiZhu {
    public static void main(String[] args) {
        Map<Integer,Cards> map = function1();
        List<Integer> list = function2();
        List<Map<Integer,Cards>> list1 = function3(map,list);
        function4(list1);
    }

    //创建纸牌
    public static Map<Integer,Cards> function1() {
        List<Integer> list =new ArrayList<>();
        String[] cardnum = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        Map<Integer, Cards> map = new HashMap<>();
        map.put(0, new Cards("red", "大王"));
        list.add(0);
        map.put(1, new Cards("black", "小王"));
        list.add(1);
        for (int i = 0; i < 13; ++i) {
            for (int j = 0; j < 4; ++j) {
                switch (j) {
                    case 0:
                        map.put(4 * i + j + 2, new Cards("♥", cardnum[i]));
                        list.add(4 * i + j + 2);
                        break;
                    case 1:
                        map.put(4 * i + j + 2, new Cards("♦", cardnum[i]));
                        list.add(4 * i + j + 2);
                        break;
                    case 2:
                        map.put(4 * i + j + 2, new Cards("♠", cardnum[i]));
                        list.add(4 * i + j + 2);
                        break;
                    case 3:
                        map.put(4 * i + j + 2, new Cards("♣", cardnum[i]));
                        list.add(4 * i + j + 2);
                        break;
                }
            }
        }
//        for (Map.Entry<Integer,Cards> entry:map.entrySet()){
//            System.out.println(entry.getKey()+","+entry.getValue().getColor()+","+entry.getValue().getNumber());
//        }
//        System.out.println(list);
        return map;
    }

    //随意洗牌
    public static List<Integer> function2(){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<54;i++)
            list.add(i);
        Collections.shuffle(list);
        return list;
    }

    //发牌
    public static List<Map<Integer,Cards>> function3(Map<Integer,Cards> map,List<Integer> list){
        List<Map<Integer,Cards>> list1 = new ArrayList<>();
        Map<Integer,Cards> player1 = new HashMap<>();
        Map<Integer,Cards> player2 = new HashMap<>();
        Map<Integer,Cards> player3 = new HashMap<>();
        Map<Integer,Cards> player4 = new HashMap<>();
        for (int i = 0;i<51;++i){
            switch (i%3){
                case 0:
                    player1.put(list.get(i),map.get(list.get(i)));
                    break;
                case 1:
                    player2.put(list.get(i),map.get(list.get(i)));
                    break;
                case 2:
                    player3.put(list.get(i),map.get(list.get(i)));
                    break;
            }
        }
        player4.put(list.get(51),map.get(list.get(51)));
        player4.put(list.get(52),map.get(list.get(52)));
        player4.put(list.get(53),map.get(list.get(53)));
        list1.add(player1);
        list1.add(player2);
        list1.add(player3);
        list1.add(player4);
        return list1;
    }

    //看牌
    public static void function4(List<Map<Integer,Cards>> list){
        List<Integer> list1 =new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();
        List<Integer> list3 =new ArrayList<>();
        List<Integer> list4 =new ArrayList<>();
        int i =0;
        for (Map<Integer,Cards> map:list){
            for (Map.Entry<Integer,Cards> entry:map.entrySet()){
                switch (i){
                    case 0:
                        list1.add(entry.getKey());
                        break;
                    case 1:
                        list2.add(entry.getKey());
                        break;
                    case 2:
                        list3.add(entry.getKey());
                        break;
                    case 3:
                        list4.add(entry.getKey());
                        break;
                }
            }
            ++i;
        }
        for (Map<Integer,Cards> map :list){
          for (Map.Entry<Integer,Cards> entry:map.entrySet()){
              System.out.print(entry.getValue().getColor()+entry.getValue().getNumber()+",");
          }
            System.out.println();
        }
    }
}
