package JVC.Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main   {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        App x= new App();
        int j;
        do {
            System.out.println("--------------------MENU----------------------");
            System.out.println("1. Kiểm tra năng lực\n2. Xem lại bài thi\n3. Thí sinh có kết quả cao nhất" );
            System.out.print("Nhập lựa chọn của bạn: ");
            j = scanner.nextInt();
            switch (j) {
                case 1:
                    x.menu1();
                    break;
                case 2:
                    System.out.println("nhập số thứ tự của bạn: ");
                    int i;
                    i = scanner.nextInt();
                    x.menu2(i-1);
                    break;
                case 3:
                    x.menu3();
                    break;
                case 4:
                    break;
            }
        } while (j < 5);
    }
}
