package ru.akhaziev.bookmanager.entity;


import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="book_title")
    private String bookTitile;

    @Column(name="book_author")
    private String bookAuthor;

    @Column(name="book_price")
    private int price;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitile() {
        return bookTitile;
    }

    public void setBookTitile(String bookTitile) {
        this.bookTitile = bookTitile;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitile='" + bookTitile + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                '}';
    }
}
