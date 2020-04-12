package day_28.Demo4;

import java.io.FileInputStream;
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
 * @create: 2020-04-12 10:32
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(),8888);
        OutputStream out = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("C:\\Users\\28586\\Desktop\\临时文件夹\\视觉\\18.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!= -1){
            out.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream in = socket.getInputStream();
        len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
        fis.close();
    }
}
