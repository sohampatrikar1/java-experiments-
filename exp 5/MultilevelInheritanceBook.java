import java.util.*;

class Book {
    String author, title, publisher;

    Book(String author, String title, String publisher) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }
}

class BookInfo extends Book {
    double price;
    int stockPosition;

    BookInfo(String author, String title, String publisher, double price, int stockPosition) {
        super(author, title, publisher);
        this.price = price;
        this.stockPosition = stockPosition;
    }
}

class BookSales extends BookInfo {
    int noOfCopiesSold;

    BookSales(String author, String title, String publisher, double price, int stockPosition, int noOfCopiesSold) {
        super(author, title, publisher, price, stockPosition);
        this.noOfCopiesSold = noOfCopiesSold;
    }

    void RevenueGenerated() {
        System.out.println("Revenue Generated: " + (price * noOfCopiesSold));
    }

    void AllShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("No. of Copies Sold: " + noOfCopiesSold);
        RevenueGenerated();
        System.out.println();
    }
}

class MultilevelInheritanceBook {
    public static void main(String[] args) {
        BookSales b1 = new BookSales("James Gosling", "Java", "Oracle", 500, 20, 10);
        BookSales b2 = new BookSales("Robert Lafore", "OOP", "Pearson", 400, 15, 8);
        BookSales b3 = new BookSales("Herbert Schildt", "Java Programming", "McGraw Hill", 600, 25, 12);

        b1.AllShow();
        b2.AllShow();
        b3.AllShow();
    }
}
