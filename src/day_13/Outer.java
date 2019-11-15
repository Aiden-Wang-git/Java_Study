package day_13;

import java.security.PublicKey;

/**
 * ClassName:Outer
 * Package:day_13
 * Description:
 *
 * @date:2019/10/22 19:29
 * @author:2858600511@qq.com
 */
public class Outer {
    public void out (){
        class Inner{
            public void inner(){
                System.out.println("局部内部类方法");
            }
        }
            Inner in = new Inner();
            in.inner();
    }
}
