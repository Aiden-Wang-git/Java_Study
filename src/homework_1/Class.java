package homework_1;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName:Class
 * Package:homework_1
 * Description:
 *
 * @date:2019/10/24 20:11
 * @author:2858600511@qq.com
 */
public class Class implements Serializable {
    private String class_name;
    public static int sum = 0;

    public Class(String class_name) {
        this.class_name = class_name;
        ++sum;
    }

    public Class(){
        ++sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(class_name, aClass.class_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(class_name);
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

}
