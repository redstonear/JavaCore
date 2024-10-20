package homeWorks.bookStorage.model;

import java.util.Objects;

public class Book {
    private String title;
    private String authorName;
    private String id;
    private double price;

    public Book() {}

    public Book(String id, String title, String authorName, double price) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName) && Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, id, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
