package day_28.Demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @program: Java_Test
 * @description: TCP服务器端
 * @author: Wang Jun
 * @create: 2020-04-12 10:32
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        File file = new File("c:\\example");
        if (!file.exists()){
            file.mkdirs();
        }
        String filename = "itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
        FileOutputStream fos = new FileOutputStream(file+File.separator+filename);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = in.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        OutputStream out = socket.getOutputStream();
        out.write("图片提交成功！".getBytes());
        socket.close();
        fos.close();
    }
}
