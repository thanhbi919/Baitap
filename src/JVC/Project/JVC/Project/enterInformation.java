package JVC.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class enterInformation {
    public ArrayList<InforUser> users = new ArrayList<>();

    public void enterInfor(){
        Scanner scanner =new Scanner(System.in);
        String name;
        int Age;
        System.out.printf("Họ và tên:");
        name = scanner.nextLine();
        System.out.print("Tuổi:");
        Age= scanner.nextInt();
        scanner.nextLine();
        InforUser user=new InforUser(name,Age);
        users.add(user);
    }
}
