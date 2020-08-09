package JVC.lesson4;

import java.util.Scanner;

public class Activity4_3 {
    static void divided(int a){
        int i=a;
        for(;i<=100-a;i=i+a) {
            System.out.print(i + ",");
        }
        System.out.println(i + ".");
    }
    static int MinMultiples(int a,int b){
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int min_mul =a*b/temp1;
        return min_mul;
    }
    public static void main(String[] args) {
        System.out.print("Entry a:");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.print("Divided by "+a+ ": ");
        divided(a);
        System.out.print("Entry b:");
        int b= scanner.nextInt();
        System.out.print("Divided by "+a+ ": ");
        divided(b);
        int c = MinMultiples(a,b);
        System.out.print("\nDivided by "+a +" & "+b+ ": ");
        divided(c);
    }
}
