package JVC.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private int total;
    private Student[] students;

    public StudentManagement() {//khoi tao danh sach sinh vien

        System.out.print("Number of students want to enter: ");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        this.total = total;
        scanner.nextLine();
        students = new Student[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gpa: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);
        }
    }

    public int getPass() {//tra ve so sinh vien qua mon
        int count = 0;
        for (Student x : students) {
            if (x.PassFail()==1) {
                count++;
            }
        }
        return count;
    }

    public int getFail() {// tra ve so sinh vien truot mon
        return total - getPass();
    }

    public ArrayList<Student> maxGpa() {//tim sinh vien co GPA cao nhat
        float max = 0;
        ArrayList<Student> maxGPA = new ArrayList<>();// mang max GPA chưa danh sach cac sinh vien đạt max GPA
        for (int i = 0; i < total; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
            }
        }
        for (int i = 0; i < total; i++) {
            if (students[i].getGpa() == max) {
                maxGPA.add(students[i]);
            }
        }
        return maxGPA;
    }

    public ArrayList<Student> minGpa() {//tim sinh vien co GPA thap nhat
        float min = students[0].getGpa();
        ArrayList<Student> minGPA = new ArrayList<>();// mang minGPA chưa danh sach cac sinh vien đạt min GPA
        for (int i = 1; i < total; i++) {
            if (students[i].getGpa() < min) {
                min = students[i].getGpa();
            }
        }
        for (int i = 0; i < total; i++) {
            if (students[i].getGpa() == min) {
                minGPA.add(students[i]);
            }
        }
        return minGPA;
    }

}
