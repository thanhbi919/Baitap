package JVC.lesson4;

import java.util.Scanner;
public class Activity4_2 {
    public static void main(String[] args) {
          System.out.print("Entry height:");
          Scanner scanner = new Scanner(System.in);
          int height = scanner.nextInt();
          int i = height - 1;
          int ii = 0;
          for (; i >= 0 && ii < height; i--, ii++) {
              for (int j = i; j > 0; j = j - 1) {
                  System.out.print(" ");
              }
              for (int k = 0; k < 2 * ii + 1; k++) {
                  System.out.print("*");
              }
              System.out.println();
          }
    }
//            *
//           ***
//          *****
//         *******
//        *********
}
