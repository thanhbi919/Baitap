package JVC.lesson6.Store;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreManagement {
    private int n;//số lượng của hàng
    private Store[] stores = new Store[n];//danh sách các của hàng
    private ArrayList<SmartPhone> x = new ArrayList<>();

    public StoreManagement() {
    }

    public StoreManagement(int n, Store[] stores) {
        this.n = n;
        this.stores = stores;
    }

    public int total5G() {
        int total5G = 0;
        for (int i = 0; i < n; i++) {

            x = stores[i].getPhones();
            for (SmartPhone y : x) {
                if (y.isHas5G() == true) {
                    total5G=total5G+y.getTotal();
                }
            }
        }
        return total5G;
    }//tổng tất cả các điện thoại có 5G

    public int totalWifi() {
        int totalWifi = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<SmartPhone> x = new ArrayList<>();
            x = stores[i].getPhones();
            for (SmartPhone y : x) {
                if (y.isHasWifi() == true) {
                    totalWifi=totalWifi+y.getTotal();
                }
            }
        }
        return totalWifi;
    }// tổng tất cả các điện thoại có wifi

    public int totalBluetooth() {
        int totalBluetooth = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<SmartPhone> x = new ArrayList<>();
            x = stores[i].getPhones();
            for (SmartPhone y : x) {
                if (y.isHasBluetooth() == true) {
                    totalBluetooth=totalBluetooth+y.getTotal();
                }
            }
        }
        return totalBluetooth;
    }//tổng tất cả các điện thoại có Bluetooth.
}
