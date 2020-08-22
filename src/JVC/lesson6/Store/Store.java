package JVC.lesson6.Store;

import java.util.ArrayList;

public class Store {
    private String name;//tên cửa hàng
    private String address;//Địa chỉ cửa hàng
    private int n;//tổng số điện thoại có trong cửa hàng
    private ArrayList<SmartPhone> phones = new ArrayList<>();//Danh sách các điện thoại có trong cửa hàng

    public Store() {
    }

    public Store(String name, String address, int n, ArrayList<SmartPhone> phones) {
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<SmartPhone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<SmartPhone> phones) {
        this.phones = phones;
    }

    public int totalPhones() {//tổng số điện thoại bán được
        int totalPhones = 0;
        for (SmartPhone x : phones) {
            totalPhones = totalPhones + x.getTotalSold();
        }
        return totalPhones;
    }

    public double totalRevenue() {// tổng doanh thu
        double totalRevenue = 0;
        for (SmartPhone x : phones) {
            totalRevenue = totalRevenue + x.getPrice() * x.getTotalSold();
        }
        return totalRevenue;
    }

}
