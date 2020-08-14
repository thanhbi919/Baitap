package JVC.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity5_2_Array {
    public static void del(int a[], int index) {
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original array: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" length: " + n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    del(arr, j);
                    n = n - 1;
                    j = j - 1;
                }
            }
        }
        System.out.print("Array after remove all duplicate elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" length: " + n);

    }
}
