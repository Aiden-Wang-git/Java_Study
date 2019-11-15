package homework_1;

import org.ietf.jgss.Oid;

import javax.swing.*;
import java.io.*;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Functions
 * Package:homework_1
 * Description:
 *
 * @date:2019/10/25 14:50
 * @author:2858600511@qq.com
 */
public class Functions {
    //读取文件到map
    public static HashMap<Class, ArrayList<Student>> inputmap(File file) {
        HashMap<Class, ArrayList<Student>> map = null;
        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(fin);
            Object object = oin.readObject();
            oin.close();
            if (object instanceof HashMap)
                map = (HashMap<Class, ArrayList<Student>>) object;
            else
                System.out.println("未找到map对象");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    //写入map到文件
    public static boolean outputmap(HashMap<Class, ArrayList<Student>> map, File file) {
        try {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(map);
            oout.flush();
            oout.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //初始化
    public static boolean init(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
                Class c1 = new Class("一班");
                Class c2 = new Class("二班");
                Class c3 = new Class("三班");
                ArrayList<Student> students1 = new ArrayList<>();
                ArrayList<Student> students2 = new ArrayList<>();
                ArrayList<Student> students3 = new ArrayList<>();
                HashMap<Class, ArrayList<Student>> map = new HashMap<>();
                map.put(c1, students1);
                map.put(c2, students2);
                map.put(c3, students3);
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(map);
                oos.flush();
                oos.close();
                return true;
            } else return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    //注册
    public static boolean add(String name, String password, String class_name, File file) {
        HashMap<Class, ArrayList<Student>> map = inputmap(file);
        Class class1 = new Class(class_name);
        Student student = new Student(name, password, class1);
        try {
            map.forEach((k, v) -> {
                if ((k.getClass_name()).equals(class_name)) {
                    v.add(student);
                }
            });
        } catch (Exception e) {
        }
        Set<HashMap.Entry<Class, ArrayList<Student>>> set = map.entrySet();
        for (HashMap.Entry<Class, ArrayList<Student>> entry : set) {
            if ((entry.getKey().getClass_name()).equals(class_name)) {
                ArrayList<Student> list = entry.getValue();
                for (Student s : list) {
                    if ((s.getName()).equals(name)) {
                        outputmap(map, file);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //登录
    public static boolean log(String name, String password, File file) {
        HashMap<Class, ArrayList<Student>> map = inputmap(file);
        for (Map.Entry<Class, ArrayList<Student>> entry : map.entrySet()) {
            ArrayList<Student> list = entry.getValue();
            for (Student student : list)
                if (student.getName().equals(name) && student.getPassword().equals(password))
                    return true;
        }
        return false;
    }

    //查看所有学生信息
    public static void look(File file) {
        HashMap<Class, ArrayList<Student>> map = inputmap(file);
        map.forEach((v, k) -> {
                    for (Student student : k)
                        System.out.println("姓名：" + student.getName() + "，密码：" + student.getPassword() + "，班级名：" + student.getCla().getClass_name());
                }
        );
    }

    public static void lookone(File file, int i) {
        HashMap<Class, ArrayList<Student>> map = inputmap(file);
        String classname;
        if (i == 1)
            classname = "一班";
        else if (i == 2)
            classname = "二班";
        else
            classname = "三班";
        for (Map.Entry<Class, ArrayList<Student>> entry : map.entrySet()) {
            if ((entry.getKey().getClass_name()).equals(classname)) {
                ArrayList<Student> list = entry.getValue();
                for (Student student : list)
                    System.out.println("姓名：" + student.getName() + "，密码：" + student.getPassword() + "，班级名：" + student.getCla().getClass_name());
            }

        }
    }

}


