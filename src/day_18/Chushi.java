package day_18;

import day_14.VIP;

/**
 * ClassName:Chushi
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 16:02
 * @author:2858600511@qq.com
 */
public class Chushi extends Employee implements VIP {
    public Chushi() {
    }
    public Chushi(String name, int ID) {
        super(name, ID);
    }
    public void work(){
        System.out.println("厨师在工作");
    }
    public void services(){
        System.out.println("厨师多加肉");
    }

}
