package day_25;

import java.io.*;

/**
 * @program: Java_Test
 * @description: 实现对象的序列化和反序列化
 * @author: Wang Jun
 * @create: 2020-02-09 15:02
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
//        function_1();
        function_2();
    }

    public static void function_1() throws IOException {
        OutputStream fos = new FileOutputStream(".\\src\\day_25\\person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person("Bob",15);
        oos.writeObject(person);
        oos.close();
    }

    public static void function_2() throws IOException,ClassNotFoundException{
        InputStream inputStream = new FileInputStream(".\\src\\day_25\\person.txt");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        Object object = ois.readObject();
        System.out.println(object);
        ois.close();
    }
}
