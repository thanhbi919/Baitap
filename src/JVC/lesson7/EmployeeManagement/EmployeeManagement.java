package JVC.lesson7.EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private ArrayList<FulltimeEmployee> fulltimeEmployees = new ArrayList<>();
    private ArrayList<ParttimeEmployee> parttimeEmployees = new ArrayList<>();
    private ArrayList<Long> totalLuong = new ArrayList<>();
    private ArrayList<Long> totalOver = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    private int n;//tổng số nhân viên

    public ArrayList<Employee> enterInfor() {//nhâp thông tin nhân viên
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tổng số nhân viên");
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
                System.out.println("Số giờ làm việc: ");
                int time;
                time = scanner.nextInt();
                scanner.nextLine();
                parttimeEmployees.add(new ParttimeEmployee(name, age, level, time));
                employees.add(new Employee(name, age, level));
            } else {
                int overTimeDay;
                System.out.println("Số ngày làm thêm: ");
                overTimeDay = scanner.nextInt();
                scanner.nextLine();
                fulltimeEmployees.add(new FulltimeEmployee(name, age, level, overTimeDay));
                employees.add(new Employee(name, age, level));
            }
        }
        return employees;
    }

    public void totalSalary() {
        int i = 0, ii = 0;
        int j = 0;
        for (Employee x : employees) {
            if (employees.get(ii).getLevel() == 0) {
                totalOver.add(parttimeEmployees.get(i).getWorkHourNumber() * 100000);
                totalLuong.add(parttimeEmployees.get(i).getWorkHourNumber() * 100);
                i++;
            } else {
                totalOver.add(fulltimeEmployees.get(j).getOverTimeDay() * 800000);
                totalLuong.add(fulltimeEmployees.get(j).getOverTimeDay() * 800000 + fulltimeEmployees.get(j).getBaseSalary());
                j++;
            }
            ii++;
        }
    }

    public void printInfor() {
        int i = 0, ii = 0;
        int j = 0;
        for (Employee x : employees) {
            System.out.print(x.toString1() + " ");
            if (employees.get(ii).getLevel() == 0) {
                System.out.print(parttimeEmployees.get(i).toString3());
                System.out.println(" Lương OT: " + totalOver.get(ii) + " Lương tổng: " + totalOver.get(ii));
                System.out.println();
                i++;
            } else {
                System.out.print(fulltimeEmployees.get(j).toString2());
                System.out.println(" Lương OT: " + totalOver.get(ii) + " Lương tổng: " + (fulltimeEmployees.get(j).getBaseSalary() + totalOver.get(ii)));
                j++;
                System.out.println();
            }
            ii++;
        }
    }

}
