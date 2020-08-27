package JVC.lesson6.Book_Management;

import java.util.Scanner;

public class BookManagement {
    private int n;//tong so sach
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public BookManagement(int n, Book[] books) {
        this.n = n;
        this.books = books;
    }

    public int totalBestSeller() {
        int count = 0;
        for (Book x : books) {
            if(x.bestSeller()==1)
            count++;
        }
        return count++;
    }
    public Book bestTotalSold(){
        int count = 0 ;
        long max = 0;
        for (int i=0;i<n;i++){
            if(books[i].getTotalSold()>max){
                max=books[i].getTotalSold();
                count =i;
            }
        }
        return books[count];
    }

}

