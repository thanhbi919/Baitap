package JVC.lesson6.Store;

public class Activity6_3 {
    public static void main(String[] args) {
        Apptest x = new Apptest();
        x.enterInformationStore();
        x.inThongtinStore();
        System.out.println();
        System.out.println("Tong so dien thoai co Bluetooth: "+x.totalHasBluetooth());
        System.out.println("Tong so dien thoai co 5G: "+x.totalHas5G());
        System.out.println("Tong so dien thoai co Wifi: "+x.totalHasWifi());
        System.out.println();

        x.bestSelling();
        System.out.println();

        x.badSelling();
        System.out.println();

        x.bestRevenue();
        System.out.println();

        x.badRevenue();
    }
}
