package JVC.lesson6.Manage_Student;

import java.util.ArrayList;

public class Activity6_2 {
    public static void main(String[] args) {
        Service x =new Service();
        // nhập thông tin sinh viên
        x.nhapThongtin();
        //in ra số sinh viên qua môn
        x.getSVpass();
        //in ra số sinh viên tạch môn
        x.getSVfail();
        //in ra sinh viên có Gpa cao nhất
        x.MaxGpa();
        //in ra sinh vien có Gpa thấp nhất
        x.MinGpa();
    }

}
