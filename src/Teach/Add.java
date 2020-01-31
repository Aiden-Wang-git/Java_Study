package Teach;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("请输入第一个数字");
        a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        b = scanner.nextInt();
        System.out.println("结果是："+(a+b));
    }
}
