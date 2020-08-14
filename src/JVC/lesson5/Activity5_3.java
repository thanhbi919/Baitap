package JVC.lesson5;

import java.util.Scanner;

public class Activity5_3 {
    public static void enterArr(int arr[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void printArr(int arr[]) {
        System.out.print("length: " + arr.length + "\t" + "elements = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.print("\n");
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the size of elements 1st array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1, arr2, arr3;
        arr1 = new int[n];
        enterArr(arr1, n);
        System.out.print("Enter the size of elements 2st array: ");
        int m = scanner.nextInt();
        arr2 = new int[m];
        enterArr(arr2, m);
        arr3 = new int[m + n];
        for (int i = 0, j = 0; i < m + n; i++) {
            if (i >= n) {
                arr3[i] = arr2[j];
                j++;
            } else {
                arr3[i] = arr1[i];
            }
        }
        System.out.println("Original array: ");
        printArr(arr1);
        printArr(arr2);
        System.out.println("Merged array: ");
        printArr(arr3);
    }
}
