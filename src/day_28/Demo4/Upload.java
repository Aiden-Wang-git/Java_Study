package day_28.Demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @program: Java_Test
 * @description: 实现多线程方法
 * @author: Wang Jun
 * @create: 2020-04-12 12:00
 */
public class Upload implements Runnable {
    private Socket socket;

    public Upload(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            File file = new File("c:\\example");
            if (!file.exists()) {
                file.mkdirs();
            }
            String filename = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
            FileOutputStream fos = new FileOutputStream(file + File.separator + filename);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            OutputStream out = socket.getOutputStream();
            out.write("图片提交成功！".getBytes());
            fos.close();
        }catch (Exception ex){
            throw  new RuntimeException();
        }

    }
}
