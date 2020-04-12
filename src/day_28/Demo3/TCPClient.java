package day_28.Demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @program: Java_Test
 * @description: TCP客户端
 * @author: Wang Jun
 * @create: 2020-04-07 10:36
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        /**
         * Socket(String host,int port)
         * 注意：构造方法只要运行，就会和服务器进行连接，连接失败，抛出异常
         *
         * OutputStream getOutputStream() 返回套接字的输出流，作用：将数据输出，输出到服务器
         * InputStream getInputStream() 返回套接字的输入流，将数据写入到客户端
         */
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(),8888);
        OutputStream out = socket.getOutputStream();
        out.write("客户端向服务器发送数据。".getBytes());
        InputStream input = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = input.read(data);
        System.out.println(new String(data,0,len));
        socket.close();
    }
}
