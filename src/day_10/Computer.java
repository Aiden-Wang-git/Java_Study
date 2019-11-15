package day_10;

/**
 * ClassName:Computer
 * Package:day_10
 * Description:
 *
 * @date:2019/10/20 13:41
 * @author:2858600511@qq.com
 */
public class Computer {
    public void openComputr(){
        System.out.println("open computer");
    }
    public void closeComputer(){
        System.out.println("close computer");
    }
    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}
