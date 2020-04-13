package day_33;

import day_29.Sort;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @program: Java_Test
 * @description:
 * @author: Wang Jun
 * @create: 2020-04-13 10:35
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        functipn2();
//        function3();
//        function4();
        function5();
    }

    public static void function1() throws Exception{
        Class c = Person.class;
        System.out.println(c);
        Class c2 = Class.forName("day_33.Person");
        System.out.println(c2);
        Person person = new Person();
        Class c3 = person.getClass();
        System.out.println(c3);
        Constructor[] cons = c2.getConstructors();//获取所有public类型的构造器
        for (Constructor con :cons)
            System.out.println(con);
        Constructor con = c2.getConstructor();//获取指定的空参构造器
        Object object = con.newInstance();
        Constructor con2 = c2.getConstructor(String.class,int.class);
        System.out.println(object);
        System.out.println(con2);
        Object obj2 = con2.newInstance("张三",18);
        System.out.println(obj2);
        Person person1 = (Person)obj2;
        System.out.println(person1);
    }

    public static void functipn2() throws Exception{
        Class class1 = Class.forName("day_33.Person");
        Object object = class1.newInstance();
        Field[] fields = class1.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
        Field field = class1.getDeclaredField("name");
        System.out.println(field);
        field.setAccessible(true);
        field.set(object,"法外狂徒张三！");
        System.out.println(object);
    }

    public static void function3() throws Exception{
        Class class1 = Class.forName("day_33.Person");
        Object object = class1.newInstance();
        Method method = class1.getMethod("funtion");
        System.out.println(method);
        method.invoke(object);
        Method method1 = class1.getMethod("sleep", String.class, int.class, int.class);
        method1.invoke(object,"小明",18,8);
    }

    public static void function4() throws Exception{
        ArrayList<String> list = new ArrayList<>();
        list.add("第一个元素。");
        Class class1 = list.getClass();
        Method method = class1.getMethod("add", Object.class);
        method.invoke(list,45);
        System.out.println(class1.getMethod("get", int.class).invoke(list,1));
//        Integer a = 45;
//        System.out.println(a);
    }

    public static void function5() throws Exception{
        FileReader reader = new FileReader(".//src//config.properties");
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        Class class1 = Class.forName(properties.getProperty("className"));
        class1.getMethod(properties.getProperty("methodName")).invoke(class1.newInstance());
    }

}
