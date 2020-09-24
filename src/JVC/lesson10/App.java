package JVC.lesson10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap ho va ten:");
        String name = scanner.nextLine();
        System.out.print("nhap mssv: ");
        String mssv = scanner.nextLine();
        int diem =0 ;
        int check =1;
        while(check !=0){
            try {
                System.out.print("điểm: ");
                Scanner scanner1 =new Scanner(System.in);
                diem=scanner1.nextInt();
                check=0;
            } catch (Exception e){
                System.out.println("Bạn phải nhập dữ liệu kiểu số!");
            }
        }
        SinhVien s= new SinhVien(mssv,name,diem);
        s.getXeploai();
        System.out.printf("Thong tin sinh vien: " );
        System.out.println(s.toString());


    }
}
