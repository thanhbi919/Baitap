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
        this.total = this.total + total;
        scanner.nextLine();

        for (int i = 0; i <= this.total; i++) {//tai sao Student[0] lai khoi tao bang null
            students = new Student[i];
        }

        for (int i = 0; i < this.total; i++) {
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
            if (x.getGpa() >= 1.5) {
                count++;
            }
        }
        return count;
    }

    public int getFail() {// tra ve so sinh vien truot mon
        return total - getPass();
    }

    public Student maxGpa() {//tim sinh vien co GPA cao nhat
        float max=0;
        int count=0  ;
        for (int i = 0; i < total; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
                count=i;
            }
        }
        return students[count];
    }

    public Student minGpa() {//tim sinh vien co GPA nho nhat
        float min = students[0].getGpa();
        int count = 0;
        for (int i = 1; i < total; i++) {
            if (students[i].getGpa() <= min) {
                min = students[i].getGpa();
                count = i;
            }
        }
        return students[count];
    }

}
