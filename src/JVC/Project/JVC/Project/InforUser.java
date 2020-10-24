package JVC.Project;

import java.io.Serializable;

public class InforUser implements Serializable {
    private String name;
    private int Age;
    private int Point;

    public InforUser(String name, int age) {
        this.name = name;
        Age = age;
    }

    public InforUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        Point = point;
    }


    @Override
    public String toString() {
        return "Họ và tên: " + name  +
                ", Age: " + Age +
                ", Điểm: " + Point
                ;
    }
}
