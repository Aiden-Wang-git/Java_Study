package day_14;

/**
 * ClassName:Jingli
 * Package:day_14
 * Description:
 *
 * @date:2019/10/24 15:58
 * @author:2858600511@qq.com
 */
public class Jingli extends Employee{
    private double hongbao;

    public double getHongbao() {
        return hongbao;
    }

    public void setHongbao(double hongbao) {
        this.hongbao = hongbao;
    }

    public Jingli(){}
    public Jingli(String name,int ID,double hongbao){
        super(name,ID);
        this.hongbao = hongbao;
    }
    public void work(){
        System.out.println("经理在工作");
    }
}
