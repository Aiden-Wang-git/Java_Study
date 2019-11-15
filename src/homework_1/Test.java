package homework_1;

import day_14.Fuwuyuan;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName:Test
 * Package:homework_1
 * Description:
 *
 * @date:2019/10/24 20:19
 * @author:2858600511@qq.com
 */
public class Test {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\28586\\Desktop\\Java_study\\shooping\\src\\homework_1\\1班.txt");
        File file = new File("src/homework_1/1班.txt");
        Functions.init(file);
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        Map<Class,Student> map = new HashMap<>();
        while (i != 3) {
            System.out.println("=====================================================");
            System.out.println("请选择功能：   1、注册        2、登录        3、退出");
            i = scanner.nextInt();
//            注册功能
            if (i == 1) {
                System.out.println("请依次输入学生姓名、密码、和所在班级");
                String name = scanner.next();
                String password = scanner.next();
                String class_name = scanner.next();
                boolean b = Functions.add(name,password,class_name,file);
                if (b)
                System.out.println("注册完成！"+"\n");
                else
                    System.out.println("注册失败！"+"\n");
            }
//            登录功能
            else if (i == 2) {
                System.out.println("请依次输入学生姓名和密码");
                String name = scanner.next();
                String password = scanner.next();
                boolean b = Functions.log(name,password,file);
                if (b){
                    System.out.println("登录成功！"+"\n");
                    int j = 1;
                    while (j!= 0){
                        System.out.println("输入1可以查看所有学生信息，输入2可以查看班级所有学生,输入0退出");
                        j = scanner.nextInt();
                        //查看所有学生信息
                        if (j==1){
                            Functions.look(file);
                        }
                        //查看某一班级学生信息
                        else if (j==2){
                           int classnum;
                            System.out.println("请输入查询的班级号：1、2、3");
                            classnum = scanner.nextInt();
                            Functions.lookone(file,classnum);
                        }
                        else if (j==0)
                            break;
                        else System.out.println("输入错误！"+"\n");
                    }
                }
                else
                    System.out.println("登录失败！"+"\n");
            }
//            退出
            else if (i==3)
            {
                System.out.println("谢谢使用=-=");
                break;
            }

            else
                System.out.println("输入错误！请再次输入。"+"\n");
        }
    }
}
