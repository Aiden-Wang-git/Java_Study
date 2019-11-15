package day_18;

import day_14.VIP;

/**
 * ClassName:Fuwuyuan
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 16:04
 * @author:2858600511@qq.com
 */
public class Fuwuyuan extends Employee implements VIP {
    public Fuwuyuan() {
    }

    public Fuwuyuan(String name, int ID) {
        super(name, ID);
    }
    public void work(){
        System.out.println("服务员在工作");
    }
    public void services(){
        System.out.println("服务员倒酒");
    }
}
