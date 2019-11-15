package day_16;

/**
 * ClassName:Test
 * Package:day_16
 * Description:
 *
 * @date:2019/11/7 16:13
 * @author:Wang Jun
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(checkQQ("2858600511"));
        System.out.println(checkTel("17521691248"));
        String[] strings = split1("12-34-56-78","-");
        for (String string :strings)
            System.out.print(string);
        System.out.println();
        String[] string2 = split1("12    34    56 78"," +");
        for (String string :string2)
            System.out.print(string);
        System.out.println();
        String[] string3 = split1("58.198.165.88","\\.+");
        for (String string :string3)
            System.out.print(string);
        System.out.println();
        System.out.println(replaceAll_1("fs387sG79B787gf87G","#"));
        System.out.println(checkEmail("2858600511@qq.com.cn"));
    }

    public static boolean checkQQ(String string){
        return string.matches("[1-9][0-9]{4,9}");
    }

    public static boolean checkTel(String string){
        return string.matches("1[34578][0-9]{9}");
    }

    public static String[] split1(String string1,String string2){
        String[]strings = string1.split(string2);
        return strings;
    }

    public static String replaceAll_1(String string1,String string2){
        return string1.replaceAll("[0-9]+",string2);
    }

    public static boolean checkEmail(String string){
        return string.matches("[^0][a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+");
    }
}
