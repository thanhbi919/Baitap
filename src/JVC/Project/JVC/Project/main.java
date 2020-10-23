package JVC.Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main   {
    public static void main(String[] args)  {
        Scanner scanner =new Scanner(System.in);
        App x= new App();
        int j;
        do {
            System.out.println("--------------------MENU----------------------");
            System.out.println("1. Kiểm tra năng lực\n2. Xem lại bài thi\n3. Thí sinh có kết quả cao nhất\n4. Thoát chương trình" );
            System.out.print("Nhập lựa chọn của bạn: ");
            j = scanner.nextInt();
            switch (j) {
                case 1:
                    try{
                        x.menu1();
                    }
                    catch (Exception e){
                    }
                    break;
                case 2:
                    int i = 0;
                    int check =1;
                    while(check !=0){
                        try {
                            System.out.println("nhập số thứ tự của bạn: ");
                            Scanner scanner1 =new Scanner(System.in);
                            i=scanner1.nextInt();
                            check=0;
                        } catch (Exception e){
                            System.out.println("Bạn phải nhập dữ liệu kiểu số!");
                        }
                    }
                    x.menu2(i-1);
                    break;
                case 3:
                    x.menu3();
                    break;
                case 4:
                    break;
            }
        } while (j < 4);
    }
}
