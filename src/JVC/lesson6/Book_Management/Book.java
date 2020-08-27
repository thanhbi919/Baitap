package JVC.lesson6.Book_Management;

public class Book {
    private String name;
    private String Author;
    private long price;
    private long totalSold;

    public Book(String name, String author, long price, long totalSold) {
        this.name = name;
        Author = author;
        this.price = price;
        this.totalSold = totalSold;
    }

    public int bestSeller(){// tra ve 1 neu la bestSeller nguoc lai tra ve 0;
        if(totalSold>1000)
            return 1;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
}
