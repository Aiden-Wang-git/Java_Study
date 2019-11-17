package day_19;

/**
 * ClassName:Tree
 * Package:day_19
 * Description:
 *
 * @date:2019/11/17 20:43
 * @author:Wang Jun
 */
public class Tree {
    private int point;
    private Tree left;
    private Tree rigth;

    public Tree(int point, Tree left, Tree rigth) {
        this.point = point;
        this.left = left;
        this.rigth = rigth;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRigth() {
        return rigth;
    }

    public void setRigth(Tree rigth) {
        this.rigth = rigth;
    }

    public static void front(Tree tree){
        System.out.print(tree.point+",");
        if (tree.left!=null) {
            front(tree.left);
        }
        if (tree.rigth!=null)
           front(tree.rigth);
    }

    public static void middle(Tree tree){
        if (tree.left!=null) {
            middle(tree.left);
        }
        System.out.print(tree.point+",");
        if (tree.rigth!=null)
            middle(tree.rigth);
    }

    public static void rear(Tree tree){
        if (tree.left!=null)
            rear(tree.left);
        if (tree.rigth!=null)
            rear(tree.rigth);
        System.out.print(tree.point+",");
    }
}
