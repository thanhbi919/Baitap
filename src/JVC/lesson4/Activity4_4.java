package JVC.lesson4;

import java.util.Scanner;

public class Activity4_4 {
    public static void main(String[] args) {
        System.out.print("Entry N: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        for(int i=1; i<=n; i=i+1){
            sum=sum+i;
        }
        float j = (float)sum/n;
        System.out.println("The sum of 1 to "+n+" is "+sum);
        System.out.println("The average is: "+j);
    }
}
