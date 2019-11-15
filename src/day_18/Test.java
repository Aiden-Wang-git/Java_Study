package day_18;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName:Test
 * Package:day_18
 * Description:
 *
 * @date:2019/11/12 16:03
 * @author:Wang Jun
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Jingli> jinglis = new ArrayList<>();
        ArrayList<Fuwuyuan> fuwuyuans = new ArrayList<>();
        ArrayList<Chushi> chushis = new ArrayList<>();

        jinglis.add(new Jingli("张总",1,125.50));
        jinglis.add(new Jingli("王总",2,130.5));

        fuwuyuans.add(new Fuwuyuan("孙阿姨",3));
        fuwuyuans.add(new Fuwuyuan("万阿姨",4));

        chushis.add(new Chushi("秦大厨",5));
        chushis.add(new Chushi("王大厨",6));

        iterator(jinglis);
        iterator(fuwuyuans);
        iterator(chushis);

    }

    public static void iterator(ArrayList<? extends Employee> array){
        Iterator<? extends Employee> iterator = array.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            employee.work();
        }
    }
}
