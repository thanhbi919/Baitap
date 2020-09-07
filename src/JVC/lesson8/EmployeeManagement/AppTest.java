package JVC.lesson8.EmployeeManagement;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        System.out.print("Total Employees: ");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        EmployeeManagement x =new EmployeeManagement(n);
        int j;
        do{
            System.out.println("--------------------MENU----------------------");
            System.out.println("1.Nhập thông tin nhân viên\n2.In thông tin nhân viên\n3.Nhân viên có lương cao nhất\n4.Nhân viên có lương thấp nhất\n5.Thoát chương trình\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            j=scanner.nextInt();
            switch (j){
                case 1:
                    x.enterInfor();
                    break;
                case 2:
                    for (Employee a: x.Employees)
                    {
                        System.out.println(a.toString());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhân viên có lương cao nhất: ");
                    x.maxTotalSalary();
                    break;
                case 4:
                    System.out.println("Nhân viên có lương thấp nhất: ");
                    x.minTotalSalary();
                    break;
            }
        }while (j<5);

    }
}
