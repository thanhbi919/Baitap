package JVC.lesson6.Book_Management;

import java.util.Scanner;

public class Apptest {
    BookManagement x;
    private int n;
    Book []books;

    public Apptest() {
    }
    public Book [] enterBookInfor() {
        System.out.print("nhap tong so sach: ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap thong tin sach:");
        books = new Book[n];
        int count = 0;
        for (int i=0;i<n;i++) {
            count++;
            System.out.println("Thong tin quyen sach thu " + count + ": ");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("price: ");
            long price = scanner.nextInt();

            System.out.print("TotalSold");
            long totalSold = scanner.nextInt();

            scanner.nextLine();
            books[i] = new Book(name, author, price, totalSold);
        }
        return books;
    }
    public void printList(){
        System.out.println("Thong tin sach: ");
        for(Book y: books) {
            System.out.println(y.toString());
        }
    }
    public void printTotalBestSeller(){
        x= new BookManagement(n,books);
        System.out.println("Tong so sach BestSeller: "+x.totalBestSeller());
    }
    public void bookBestSold(){
        System.out.println("Sach ban chay nhat: "+x.bestTotalSold().toString());
    }
}
