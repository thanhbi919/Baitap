package JVC.lesson6.Manage_Student;

import java.util.ArrayList;

public class Service {
    private StudentManagement x;

    public Service() {
    }

    public void nhapThongtin(){
        x = new StudentManagement();
    }

    public void getSVpass(){
        //in ra số sinh viên qua môn
        System.out.println("\nSố lượng sv qua môn: " + x.getPass());
    }

    public void getSVfail(){
        //in ra số sinh viên tạch môn
        System.out.println("\nSố lượng sv tạch môn: " + x.getFail());
    }

    public void MaxGpa(){
        //in ra sinh viên có Gpa cao nhất
        System.out.println("\nSinh viên có GPA cao nhất: ");
        for (Student a : x.maxGpa()) {
            a.printInformaton();
        }
    }

    public void MinGpa(){
        System.out.println("\nSinh viên có GPA thấp nhất: ");
        for (Student a : x.minGpa()) {
            a.printInformaton();
        }
    }

}
