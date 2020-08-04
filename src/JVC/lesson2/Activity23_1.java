package JVC.lesson2;

import java.util.Scanner;

public class Activity23_1 {
    public static void main(String[] args) {
//        System.out.print("nhap a: ");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        System.out.println("Bang cuu chuong tu 1-10");
        for (int j=1;j<11;j++) {
            System.out.println(j);
            for (int i = 1; i < 11; i++) {
                System.out.println(j + "*" + i + "=" + (j * i));
            }
            System.out.println("");
        }
    }
}
