package JVC.lesson7.EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementnNew {
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Long> totalLuong = new ArrayList<>();
    private ArrayList<Long> totalOver = new ArrayList<>();
    private int n;//tổng số nhân viên

    public ArrayList<Employee> enterInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tổng số nhân viên: ");
        n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Loại nhân viên(parttime nhap 0, lính nhap 1, sếp nhap 2): ");
            int level = scanner.nextInt();
            scanner.nextLine();
            if (level == 0) {
                System.out.print("Số giờ làm việc: ");
                int time;
                time = scanner.nextInt();
                scanner.nextLine();
                employees.add(new ParttimeEmployee(name, age, level, time));
            } else {
                int overTimeDay;
                System.out.print("Số ngày làm thêm: ");
                overTimeDay = scanner.nextInt();
                scanner.nextLine();
                employees.add(new FulltimeEmployee(name, age, level, overTimeDay));
            }
        }
        return employees;
    }

    public void totalSalary() {
        int i = 0, ii = 0;
        int j = 0;
        for (Employee x : employees) {
            if (x instanceof ParttimeEmployee) {
                ParttimeEmployee parttimeEmployee = (ParttimeEmployee) x;
                totalOver.add(parttimeEmployee.getWorkHourNumber() * 100000);
                totalLuong.add(parttimeEmployee.getWorkHourNumber() * 100000);
            } else {
                FulltimeEmployee fulltimeEmployee = (FulltimeEmployee) x;
                totalOver.add(fulltimeEmployee.getOverTimeDay() * 800000);
                totalLuong.add(fulltimeEmployee.getOverTimeDay() * 800000 + fulltimeEmployee.getBaseSalary());
            }
        }
    }

    public void printInfor() {
        int ii = 0;
        for (Employee x : employees) {
//            System.out.println();
            if (x instanceof ParttimeEmployee) {
                ParttimeEmployee parttimeEmployee = (ParttimeEmployee) x;
                System.out.print(parttimeEmployee.toString());
                System.out.println("Lương OT: " + totalOver.get(ii) +"\n"+ "Lương tổng: " + totalOver.get(ii));
                System.out.println();
            } else {
                FulltimeEmployee fulltimeEmployee = (FulltimeEmployee) x;
                System.out.print(fulltimeEmployee.toString());
                System.out.println("Lương OT: " + totalOver.get(ii) +"\n"+ "Lương tổng: " + (fulltimeEmployee.getBaseSalary() + totalOver.get(ii)));
                System.out.println();
            }
            ii++;
        }
    }

}
