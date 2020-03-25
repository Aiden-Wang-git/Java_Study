package day_28;

import java.io.IOException;
import java.net.*;

/**
 * @program: Java_Test
 * @description: UDP协议的发送方，需要两个类，数据封装类，数据包发送类。
 * @author: Wang Jun
 * @create: 2020-03-25 21:11
 */
public class UDPSent {
    public static void main(String[] args) throws IOException {
        /**
         * 创建包装类对象，包装要发送的数据，接收端IP,端口
         */
        byte[] bytes = "你好，这是UDP发送的内容".getBytes();
        InetAddress inetAddress =InetAddress.getLocalHost();
//        String IP = inetAddress.getHostAddress();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,inetAddress,6000);
        /**
         * 数据包的发送和接受对象
         */
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}
