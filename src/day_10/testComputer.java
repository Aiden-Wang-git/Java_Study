package day_10;

/**
 * ClassName:testComputer
 * Package:day_10
 * Description:
 *
 * @date:2019/10/20 13:46
 * @author:2858600511@qq.com
 */
public class testComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Mouse m1 = new Mouse();
        keyBoard k1 = new keyBoard();
        c1.openComputr();
        c1.useUSB(m1);
        c1.useUSB(k1);
        c1.closeComputer();
    }
}
