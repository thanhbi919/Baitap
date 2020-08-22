package JVC.lesson6.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Apptest {
    private Store[] store;
    StoreManagement x;

    public SmartPhone enterInformationPhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên hãng: ");
        String brand = scanner.nextLine();

        System.out.print("Có bluetooth không ");
        boolean bluetooth = scanner.nextBoolean();

        System.out.print("Có wifi không ");
        boolean wifi = scanner.nextBoolean();

        System.out.print("Có 5G không ");
        boolean fiveG = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Hệ điều hành: ");
        String HDH = scanner.nextLine();

        System.out.print("Bộ nhớ: ");
        float memory = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Màu: ");
        String color = scanner.nextLine();

        System.out.print("Giá bán: ");
        long price = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Tổng số : ");
        int total = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tổng số bán được: ");
        int totalSold = scanner.nextInt();
        scanner.nextLine();

        SmartPhone x = new SmartPhone(brand, bluetooth, fiveG, wifi, HDH, memory, color, price, totalSold,total);
        return x;
    }
    public StoreManagement enterInformationStore() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số cửa hàng: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        store = new Store[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin của hàng thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Address: ");
            String Address = scanner.nextLine();
//            scanner.nextLine();

            System.out.print("Tổng số điện thoại có trong của hàng: ");
            int m = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            ArrayList<SmartPhone> y = new ArrayList<>();
            System.out.print("Số hãng điện thoại trong của hàng: ");
            int count = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < count; j++) {
                System.out.println("nhap thong tin dien thoai " + name + ": ");
                y.add(enterInformationPhone());
            }

            store[i] = new Store(name, Address, m, y);

        }
        x = new StoreManagement(n, store);
        return x;
    }
    public void inThongtinStore() {
        for (Store i : store) {
            System.out.println("Ten cua hang: " + i.getName());
            System.out.println("Dia chi: " + i.getAddress());
            System.out.println("Tong so dien thoai trong cua hang: " + i.getN());

            ArrayList<SmartPhone> j = i.getPhones();
            String name = "";
            for (SmartPhone k : j) {
                name = name + k.getBrand() + ",";
            }
            System.out.println("Danh sach cac dien thoai co trong cua hang: " + name);
        }
    }
    public void bestSelling() {
        int best = 0;
        int count = 0;
        for (int i = 0; i < store.length; i++) {
            if (best < store[i].totalPhones()) {
                best = store[i].totalPhones();
                count = i;
            }
        }
        System.out.println("Cửa hàng bán nhiều dien thoai nhat: ");
        System.out.println("Ten cua hang: " + store[count].getName());
        System.out.println("Dia chi: " + store[count].getAddress());
        System.out.println("Tong so dien thoai ban duoc " + best);

    }
    public void bestRevenue(){
        double best = 0;
        int count = 0;
        for (int i = 0; i < store.length; i++) {
            if (best < store[i].totalRevenue()) {
                best = store[i].totalRevenue();
                count = i;
            }
        }
        System.out.println("Cửa hàng doanh dien thoai nhat: ");
        System.out.println("Ten cua hang: " + store[count].getName());
        System.out.println("Dia chi: " + store[count].getAddress());
        System.out.println("Tong so dien thoai ban duoc " + best);

    }
    public void badSelling() {
        int bad = store[0].totalPhones();
        int count = 0;
        for (int i = 1; i < store.length; i++) {
            if (bad > store[i].totalPhones()) {
                bad = store[i].totalPhones();
                count = i;
            }
        }
        System.out.println("Cửa hàng bán nhiều dien thoai nhat: ");
        System.out.println("Ten cua hang: " + store[count].getName());
        System.out.println("Dia chi: " + store[count].getAddress());
        System.out.println("Tong so dien thoai ban duoc " + bad);
    }
    public void badRevenue(){
        double bad = store[0].totalPhones();
        int count = 0;
        for (int i = 1; i < store.length; i++) {
            if (bad > store[i].totalRevenue()) {
                bad = store[i].totalRevenue();
                count = i;
            }
        }
        System.out.println("Cửa hàng bán nhiều dien thoai nhat: ");
        System.out.println("Ten cua hang: " + store[count].getName());
        System.out.println("Dia chi: " + store[count].getAddress());
        System.out.println("Tong so dien thoai ban duoc " + bad);
    }
    public int totalHasBluetooth() {
        return x.totalBluetooth();
    }
    public int totalHasWifi(){
        return x.totalWifi();
    }
    public int totalHas5G() {
        return x.total5G();
    }

}
