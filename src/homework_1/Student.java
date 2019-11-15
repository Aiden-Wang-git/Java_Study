package homework_1;

import java.io.Serializable;

/**
 * ClassName:Student
 * Package:homework_1
 * Description:
 *
 * @date:2019/10/24 20:09
 * @author:2858600511@qq.com
 */
public class Student implements Serializable {
    private String name;
    private String password;
    private Class cla;

    public Student(String name, String password, Class cla) {
        this.name = name;
        this.password = password;
        this.cla = cla;
    }

    public Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Class getCla() {
        return cla;
    }

    public void setCla(Class cla) {
        this.cla = cla;
    }
}
