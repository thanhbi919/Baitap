package JVC.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class enterInformation {
    public ArrayList<InforUser> users = new ArrayList<>();

    public void enterInfor(){
        Scanner scanner =new Scanner(System.in);
        String name;
        int Age=0;
        System.out.printf("Họ và tên:");
        name = scanner.nextLine();
        int check =1;
        while(check !=0){
            try {
                System.out.print("Tuổi:");
                Scanner scanner1 =new Scanner(System.in);
                Age=scanner1.nextInt();
                check=0;
            } catch (Exception e){
                System.out.println("Bạn phải nhập dữ liệu kiểu số!");
            }
        }
//        scanner.nextLine();
        InforUser user=new InforUser(name,Age);
        users.add(user);
    }
}
