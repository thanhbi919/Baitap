package JVC.lesson4;

import java.util.Scanner;

public class Activity4_1 {
    public static void main(String[] args) {
        System.out.print("Entry Fibonacci length:");
        Scanner scanner = new Scanner(System.in);
        int fib=scanner.nextInt();
        System.out.println("This is the Fibonacci sequence:");
        System.out.print("0,1,");
        int fib2=1;
        int fib1=0;
        int fibo;
        for(int i = 2; i < fib; i++){
            fibo=fib1+fib2;
            if(i!=fib-1) {
                System.out.print(fibo + ",");
            }
            else {
                System.out.println(fibo);
            }
            fib1=fib2;
            fib2=fibo;
        }
    }
}
