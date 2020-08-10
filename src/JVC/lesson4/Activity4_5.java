package JVC.lesson4;

import java.util.Scanner;

public class Activity4_5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Entry N: ");
        int n= scanner.nextInt();
        int m=1;
        for (int i=1; i<=n; i++ ){
            m=m*i;
        }
        System.out.println("Factorial of "+n+" is "+m);
    }
}
