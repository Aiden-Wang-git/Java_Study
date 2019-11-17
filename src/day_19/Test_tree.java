package day_19;

/**
 * ClassName:Test
 * Package:day_19
 * Description:
 *
 * @date:2019/11/17 20:51
 * @author:Wang Jun
 */
public class Test_tree {
    public static void main(String[] args) {
        Tree t0 = new Tree(0,null,null);
        Tree t1 = new Tree(1,null,null);
        Tree t2 = new Tree(2,null,null);
        Tree t3 = new Tree(3,null,null);
        Tree t4 = new Tree(4,null,null);
        Tree t5 = new Tree(5,null,null);
        Tree t6 = new Tree(6,null,null);
        Tree t7 = new Tree(7,null,null);
        Tree t8 = new Tree(8,null,null);
        Tree t9 = new Tree(9,null,null);
        Tree t10 = new Tree(10,null,null);
        t0.setLeft(t1);
        t0.setRigth(t2);
        t1.setLeft(t3);
        t1.setRigth(t4);
        t2.setLeft(t5);
        t2.setRigth(t6);
        t3.setLeft(t7);
        t5.setLeft(t8);
        t5.setRigth(t9);
        t6.setRigth(t10);
        //前序遍历
        Tree.front(t0);
        System.out.println();
        //中序遍历
        Tree.middle(t0);
        System.out.println();
        //后序遍历
        Tree.rear(t0);




     }
}
