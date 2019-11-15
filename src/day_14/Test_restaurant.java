package day_14;

/**
 * ClassName:Test_restaurant
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 16:06
 * @author:2858600511@qq.com
 */
public class Test_restaurant {
    public static void main(String[] args) {
        Jingli jingli = new Jingli("经理",1,100);
        Chushi chushi = new Chushi("厨师",2);
        Fuwuyuan fuwuyuan = new Fuwuyuan("服务员",3);
        jingli.work();
        chushi.services();
        chushi.work();
        fuwuyuan.services();
        fuwuyuan.work();
    }
}
