import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName:Shopp
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2019/10/11 15:24
 * @author:2858600511@qq.com
 */
public class Shopp {
    public static void main(String[] args) {
        ArrayList<FruitItem> array = new ArrayList<FruitItem>();
        init(array);
        while (true){
            mainMenu();
            int choose = chooseFunction();
            switch (choose){
                case 1:
                    showFruitList(array);
                    break;
                case 2:
                    addFruitList(array);
                    break;
                case 3:
                    deleteFruitlist(array);
                    break;
                case 4:
                    updateFruitList(array);
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("=====================欢迎光临=====================");
        System.out.println("1:货物清单      2：添加货物      3：删除货物      4：修改货物      5：退出");
        System.out.println("请输入要操作功能的序号");
    }

    public static int chooseFunction(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void showFruitList(ArrayList<FruitItem> array){
        System.out.println();
        System.out.println("=====================商品库存=====================");
        System.out.println("商品编号        商品名称           商品价格");
        for (int i = 0;i<array.size();i++){
            FruitItem item = array.get(i);
            System.out.println(item.ID+"            "+item.name+"              "+item.price);
        }
    }

    public static void addFruitList(ArrayList<FruitItem> array){
        FruitItem f1 = new FruitItem();
        Scanner sc = new Scanner(System.in);
        System.out.println("你选择的是添加商品功能");
        System.out.print("请输入商品编号：");
        int ID = sc.nextInt();
        System.out.print("请输入商品名字：");
        String name = sc.next();
        System.out.print("请输入商品价格：");
        double price = sc.nextDouble();
        f1.ID = ID;
        f1.name = name;
        f1.price = price;
        array.add(f1);
    }

    public static void deleteFruitlist(ArrayList<FruitItem> array){
        System.out.println("你选择的是删除功能");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择删除商品的编号");
        int ID = sc.nextInt();
        for (int i =0;i<array.size();i++){
            FruitItem item = array.get(i);
            if (item.ID==ID){
                array.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("你输入的编号不存在");
    }

    public static void updateFruitList(ArrayList<FruitItem> array){
        System.out.println("你选择的是修改功能");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改商品的编号");
        int ID= sc.nextInt();
        for (int i=0;i<array.size();i++){
            FruitItem item = array.get(i);
            if (ID==item.ID){
                System.out.println("请输入新的商品编号");
                item.ID = sc.nextInt();
                System.out.println("请输入新的商品名称");
                item.name = sc.next();
                System.out.println("请输入新的商品价格");
                item.price = sc.nextDouble();
                System.out.println("修改成功");
                return;
            }
            System.out.println("未找到该商品");
        }
    }

    private static void init(ArrayList<FruitItem> array) {
        FruitItem f1 = new FruitItem();
        f1.ID = 9527;
        f1.name = "香蕉";
        f1.price = 10.5;

        FruitItem f2 = new FruitItem();
        f2.ID = 9528;
        f2.name = "西瓜";
        f2.price = 8.5;

        FruitItem f3 = new FruitItem();
        f3.ID = 9529;
        f3.name = "苹果";
        f3.price = 5.5;

        array.add(f1);
        array.add(f2);
        array.add(f3);
    }
}
