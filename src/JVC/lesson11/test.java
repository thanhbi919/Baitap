package JVC.lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i=0;i<1000000;i++){
            a.add(1);
        }
        for(int i=0;i<1000000;i++){
            b.add(1);
        }

        float start_time = System.nanoTime();
        for (int i=0;i<1000000;i++){
            a.get(50000);
        }
        float end_time = System.nanoTime();
        System.out.println("thời gian lấy phần tử của LinkedList: "+(end_time-start_time));

        float start_time1 = System.nanoTime();
        for (int i=0;i<1000000;i++){
            b.get(50000);
        }
        float end_time1 = System.nanoTime();
        System.out.println("thời gian lấy phần tử của ArrayList: "+(end_time1-start_time1));

        float start_time2 = System.nanoTime();
        for (int i=0;i<100000;i++){
            a.remove(50000);
        }
        float end_time2 = System.nanoTime();
        System.out.println("thời gian xóa phần tử của LinkedList: "+(end_time2-start_time2));

        float start_time3 = System.nanoTime();
        for (int i=0;i<100000;i++){
            b.remove(50000);
        }
        float end_time3 = System.nanoTime();
        System.out.println("thời gian xóa phần tử của ArrayList: "+(end_time3-start_time3));

    }
}
