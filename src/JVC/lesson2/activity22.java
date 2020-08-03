package JVC.lesson2;

import java.util.Scanner;

public class activity22 {
    public static void main(String[] args) {
        System.out.print("nhap n: ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a= n;
        int b=n*10+n;
        int c=n*100+b;
        System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));

    }
}
