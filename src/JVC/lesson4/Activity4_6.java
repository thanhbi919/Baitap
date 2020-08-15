package JVC.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int b=a;
        List<Integer> mod = new ArrayList<>();
        int count = 0;
        while (a / 2 >= 0) {
            mod.add(a % 2);
            if (a / 2 == 0) {
                mod.get(a % 2);
                break;
            }
            a = a / 2;
            count++;
        }
        System.out.print("Binary number of "+b+" is: ");
        for (int i = count; i >= 0; i--) {
            System.out.print(mod.get(i));
        }
    }
}
