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
        writeGBK();
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
}
