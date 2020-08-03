package JVC.lesson2;

import java.util.Scanner;

public class activity23 {
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
}
