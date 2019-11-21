package day_20;

/**
 * ClassName:Cards
 * Package:day_20
 * Description:
 *
 * @date:2019/11/21 15:40
 * @author:Wang Jun
 */
public class Cards {
private String color;
private String number;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Cards(String color, String number) {
        this.color = color;
        this.number = number;
    }
}
