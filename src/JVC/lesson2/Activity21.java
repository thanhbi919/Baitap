package JVC.lesson2;

import java.util.Scanner;

public class activity21 {
    public static void main(String[] args) {

        System.out.print("nhap a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

    }
}
