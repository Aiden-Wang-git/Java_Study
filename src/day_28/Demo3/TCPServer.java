package day_28.Demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: Java_Test
 * @description: TCP服务器端
 * @author: Wang Jun
 * @create: 2020-04-12 09:46
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        System.out.println(socket);
        InputStream input = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = input.read(data);
        System.out.println(new String(data,0,len));
        OutputStream out = socket.getOutputStream();
        out.write("服务器向客户端发送数据。".getBytes());
        socket.close();
    }
}
