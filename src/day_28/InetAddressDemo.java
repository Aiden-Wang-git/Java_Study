package day_28;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: Java_Test
 * @description: 表示互联网中的IP地址
 * @author: Wang Jun
 * @create: 2020-03-25 19:01
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        function1();
        function2();
    }

    public static void function1() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
    }

    public static void function2() throws UnknownHostException {
        /**
         * 通过Host的名字获取IP地址
         */
        InetAddress inetAddress = InetAddress.getByName("WangJun");
        System.out.println(inetAddress);
    }
}
