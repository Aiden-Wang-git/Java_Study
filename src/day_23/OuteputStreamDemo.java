package day_23;

import day_22.Myfliter;

import java.io.*;

/**
 * ClassName:OuteputStreamDemo
 * Package:day_23
 * Description:
 *
 * @date:2020/1/7 14:52
 * @author:Wang Jun
 */
public class OuteputStreamDemo {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        demo5();
    }

    public static void demo1() throws IOException {
        OutputStream outputStream = new FileOutputStream(".\\src\\day_23\\test.txt", false);
        outputStream.write("字符串".getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write("换行".getBytes());
        outputStream.close();
    }

    public static void demo2() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(".\\src\\day_23\\a.txt", true);
            outputStream.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void demo3() throws IOException {
        InputStream inputStream = new FileInputStream(".\\src\\day_23\\test.txt");
        OutputStream outeputStream = new FileOutputStream(".\\src\\day_23\\test_new.txt");
        int flag = 0;
        while ((flag = inputStream.read()) != -1){
            outeputStream.write(flag);
            System.out.print((char) flag);
        }
//        byte[] bytes = new byte[15];
//        flag = inputStream.read(bytes);
//        System.out.println(new String(bytes));
//        System.out.println(flag);
        inputStream.close();
        outeputStream.close();
    }

    public static void demo4() throws IOException{
        long start = System.currentTimeMillis();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] bytes = new byte[1024];
        int flag = 0;
        File[] files = new File("c:\\CloudMusic").listFiles(new Myfliter());
        for (File file:files){
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(".\\src\\day_23\\music\\"+file.getName());
            while (flag !=-1){
                flag = inputStream.read(bytes);
                outputStream.write(bytes);
            }
        }
        outputStream.close();
        inputStream.close();
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
        System.out.println(Math.pow(2,16));
    }

    public static void demo5(){
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(".\\src\\day_23\\test.txt");
            writer = new FileWriter(".\\src\\day_23\\test_copy.txt");
            int len = 0;
            char[] chars = new char[1024];
            while ((len = reader.read(chars))!=-1){
                writer.write(chars,0,len);
                writer.flush();
            }
        }catch (IOException ex){
            ex.printStackTrace();
            throw new  RuntimeException("复制失败");
        }finally {
            try {
                if (writer!=null)
                    writer.close();
            }catch (IOException e){
                throw new RuntimeException("释放资源失败");
            }finally {
                try {
                    if ((reader!=null))
                        reader.close();
                }catch (IOException e){
                    throw new RuntimeException("释放资源失败");
                }
            }

        }
    }
}
