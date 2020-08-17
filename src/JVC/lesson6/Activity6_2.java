package JVC.lesson6;

import java.util.ArrayList;

public class Activity6_2 {
    public static void main(String[] args) {
        // nhập thông tin sinh viên
        StudentManagement x = new StudentManagement();

        int pass = x.getPass();
        //in ra số sinh viên qua môn
        System.out.println("\nSố lượng sv qua môn: " + pass);

        //in ra số sinh viên tạch môn
        int fail = x.getFail();
        System.out.println("\nSố lượng sv tạch môn: " + fail);

        //in ra sinh viên có Gpa cao nhất
        ArrayList<Student> maxGpa = x.maxGpa();
        System.out.println("\nSinh viên có GPA cao nhất: ");
        for (Student a : maxGpa) {
            a.printInformaton();
        }

        //in ra sinh vien có Gpa thấp nhất
        ArrayList<Student> minGpa = x.minGpa();
        System.out.println("\nSinh viên có GPA thấp nhất: ");
        for (Student a : minGpa) {
            a.printInformaton();
        }
    }

}
