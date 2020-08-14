package JVC.lesson5;

import java.util.*;

public class Activity5_2_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            arr.add(scanner.nextInt());
        }
        //Collections.sort(arr);
        System.out.print("Original array: ");
        System.out.print(arr);
        System.out.println(" length: " + n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) == arr.get(i)) {
                    arr.remove(j);
                    n = n - 1;
                    j = j - 1;
                }
            }
        }
        System.out.print("Array after remove all duplicate elements: ");
        System.out.print(arr);
        System.out.println(" length: " + n);

    }
}
