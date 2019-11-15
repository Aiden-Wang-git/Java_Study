package day_18;

/**
 * ClassName:Employee
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 15:54
 * @author:2858600511@qq.com
 */
public abstract class Employee {
    private String name;
    private int ID;
    public Employee(){}
    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public abstract void work();
}
