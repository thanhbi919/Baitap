package JVC.lesson5;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class Activity5_1 {
    public static int check_Arm(int a) {
        int count = 1;
        int b = a;
        List<Integer> x = new ArrayList<>();
        int Arm = 0;
        while (b / 10 > 0) {
            count = count + 1;
            x.add(b % 10);
            b = b / 10;
            if (b < 10) x.add(b);
        }
        if (count == 1) return 1;

        for (int arr : x) {
            Arm += Math.pow(arr, count);
        }
        if (Arm == a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = 1;
        while (i < 100000) {
            if (check_Arm(i) == 1) {
                System.out.print(i + "\t");
            }
            i++;
        }

    }
}
