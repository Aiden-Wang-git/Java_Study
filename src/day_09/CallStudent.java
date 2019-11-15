package day_09;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName:CallStudent
 * Package:day_09
 * Description:
 *
 * @date:2019/10/18 14:43
 * @author:2858600511@qq.com
 */
public class CallStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("张三");
        s1.setAge(6);
        s2.setName("李四");
        s2.setAge(7);
        s3.setName("王五");
        s3.setAge(8);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        printStudent(students);
        randomSelect(students);

    }
    public static void printStudent(ArrayList<Student> students){
        for (int i=0; i<students.size();++i){
            Student s = students.get(i);
            System.out.println("name:"+s.getName()+",age:"+s.getAge());
        }
    }
    public static void randomSelect(ArrayList<Student> students){
        Random r = new Random();
        int index = r.nextInt(students.size());
        Student s = students.get(index);
        System.out.println("name:"+s.getName()+"age:"+s.getAge());
    }
}
