package day_15;

/**
 * ClassName:HelloWorld
 * Package:day_15
 * Description:
 *
 * @date:2019/11/6 17:11
 * @author:2858600511@qq.com
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s = "helloworld";
        String s_new = "HelloWorld";
        System.out.println(s);
        byte[] bytes = s.getBytes();
        char[] chars = s.toCharArray();
        for (byte c : bytes)
            System.out.println(c);
        for (char c :chars)
            System.out.print(c);
        System.out.println(s.startsWith("hel")+" "+s.endsWith("rld")+" "+s.contains("low") +" "+s.indexOf("o"));
        System.out.println("s.equalsIgnoreCase(s_new)="+s.equalsIgnoreCase(s_new));
        System.out.println("s.equals(s_new)="+s.equals(s_new));
        function1("AS456asdWDs45");
        function2("wFEFfedWEDFfds");
        function3("jaajava890fajava46sjava89java","java");
    }

    public static void function1(String string){
        int low=0,high=0,num=0;
        char[] chars = string.toCharArray();
        for (char c :chars){
            if ('a'<=c && c<='z')
                ++low;
            if ('A'<=c && c<='Z')
                ++high;
            if ('0'<=c && c<='9')
                ++num;
        }
        System.out.println("low:"+low+",high:"+high+",num:"+num);
    }

    public static void function2(String string){
        String first = string.substring(0,1);
        String next = string.substring(1);
        System.out.println(first.toUpperCase()+next.toLowerCase());
    }

    public static void function3(String string,String target){
        int count=0;
        int length = target.length();
        String string_new = string;
       while ((string_new.indexOf(target))!=-1){
            ++count;
            string_new = string_new.substring(string_new.indexOf(target)+length);
        }
        System.out.println(target+"的个数为："+count);
    }
}
