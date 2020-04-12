package day_28.Demo4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: Java_Test
 * @description: TCP多线程服务器
 * @author: Wang Jun
 * @create: 2020-04-12 12:04
 */
public class TCPThredServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket socket = server.accept();
            new Thread(new Upload(socket)).start();
        }
    }
}
