package day_24;

import java.io.*;

/**
 * @program: Java_Test
 * @description: IO转换流
 * @author: Wang Jun
 * @create: 2020-02-02 11:11
 */
public class Demo {
    public static void main(String[] args) throws IOException{
//        writeGBK();
//        bufferOut();
//        bufferInput();
//        long time1 = System.currentTimeMillis();
//        copyfast();
//        long time2 = System.currentTimeMillis();
//        copyslow();
//        long time3 = System.currentTimeMillis();
//        System.out.println("快速复制所用时间："+(time2-time1));
//        System.out.println("慢速复制所用时间："+(time3-time2));
//        Buffered();
        bufferdcopy();
    }

    /**
     * 转换流对象OutPutStreamWriter对象写文本
     * 文本采用GBK形式写入
     */
    public static void writeGBK() throws IOException {
        OutputStream outputStream = new FileOutputStream(".\\src\\day_24\\test.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"GBK");
        outputStreamWriter.write("写入GBK");
        outputStreamWriter.close();
        InputStream inputStream = new FileInputStream(".\\src\\day_24\\test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"GBK");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = inputStreamReader.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }

    public static void bufferOut() throws IOException{
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(".\\src\\day_24\\bufferout.txt",true));
        bufferedOutputStream.write(55);
        byte[] bytes = "hello world".getBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
    }

    public static void bufferInput() throws IOException{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(".\\src\\day_24\\test.txt"));
        char[] bytes = new char[10];
        int len = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream,"UTF-8");
        while ((len = inputStreamReader.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
        inputStreamReader.close();
    }

    public static void copyfast() throws IOException{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(".\\src\\day_24\\红警2共和国之辉.rar"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(".\\src\\day_24\\红警2共和国之辉copyfast.rar"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }

    public static void copyslow() throws IOException{
        InputStream bufferedInputStream = new FileInputStream(".\\src\\day_24\\红警2共和国之辉.rar");
        OutputStream bufferedOutputStream = new FileOutputStream(".\\src\\day_24\\红警2共和国之辉copyslow.rar");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }

    public static void Buffered() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\src\\day_24\\test.txt"));
        int index = 1;
        String string;
        while ((string = bufferedReader.readLine())!=null){
            System.out.println(index+":"+string);
            ++index;
        }
        bufferedReader.close();
    }

    public static void bufferdcopy() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(".\\src\\day_24\\test.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".\\src\\day_24\\bufferdcopy.txt"));
        int line = 1;
        String string;
        while ((string = bufferedReader.readLine()) != null){
            System.out.println(line+":"+string);
            bufferedWriter.write(line+":"+string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            ++line;
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
