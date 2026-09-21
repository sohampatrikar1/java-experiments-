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

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println();
    }
}

class SingleInheritanceBook {
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("James Gosling", "Java", "Oracle");
        BookInfo b2 = new BookInfo("Robert Lafore", "OOP", "Pearson");
        BookInfo b3 = new BookInfo("Herbert Schildt", "Java Programming", "McGraw Hill");

        b1.show();
        b2.show();
        b3.show();
    }
}
