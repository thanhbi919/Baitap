package JVC.lesson8.EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    public ArrayList<Employee> Employees = new ArrayList<>();//danh sách nhân viên
    private int n;
    public ArrayList<Employee> MaxTotalsalary =new ArrayList<>();//danh sách những nhân viên có lương cao nhất bằng nhau
    public ArrayList<Employee> MinTotalsalary =new ArrayList<>();//danh sách những nhân viên có lương thấp bằng nhau

    Scanner scanner = new Scanner(System.in);

    public EmployeeManagement(int n) {
        this.n = n;
    }

    public ArrayList<Employee> enterInfor() {
        System.out.println("Enter information Employees");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ "+(i+1) +": ");
            System.out.print("Name: ");
            String name =scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.printf("IdentificationNumber: ");
            String identificationNumber=scanner.nextLine();

            System.out.print("parttime (enter 0) or fulltime(enter 1): ");
            int level = scanner.nextInt();
            scanner.nextLine();

            if(level==0) {
                System.out.print("TotalWorkingShifts: ");
                int totalWorkingShift =scanner.nextInt();
                scanner.nextLine();

                System.out.print("Base Salary: ");
                long baseSalary = scanner.nextLong();
                scanner.nextLine();

                Employee parttimeEmployee = new ParttimeEmployee(name,age,identificationNumber,totalWorkingShift,baseSalary);
                Employees.add(parttimeEmployee);
            }else{
                System.out.print("TotalWorkingDays: ");
                int totalWorkingDays =scanner.nextInt();
                scanner.nextLine();

                System.out.print("Daily Salary: ");
                long dailySalary = scanner.nextLong();
                scanner.nextLine();

                Employee fulltimeEmployee = new FulltimeEmployee(name,age,identificationNumber,totalWorkingDays,dailySalary);
                Employees.add(fulltimeEmployee);
            }
        }
        return Employees;
    }

    public void maxTotalSalary(){
        long max=0;
        for (Employee x:Employees){
            if(x.calculateSalary()>=max){
                max =x.calculateSalary();
            }
        }
        for (Employee x: Employees){
            if(max ==x.calculateSalary()){
                MaxTotalsalary.add(x);
            }
        }
        for(Employee x: MaxTotalsalary ){
            System.out.print(x.toString());
            System.out.println("TotalSalary: "+max);
        }
    }

    public void minTotalSalary(){
        long min=Employees.get(0).calculateSalary();
        for (Employee x:Employees){
            if(x.calculateSalary()<=min){
                min =x.calculateSalary();
            }
        }
        for (Employee x: Employees){
            if(min ==x.calculateSalary()){
                MinTotalsalary.add(x);
            }
        }
        for(Employee x: MinTotalsalary ){
            System.out.print(x.toString());
            System.out.println(" TotalSalary: "+min);
        }
    }

}
