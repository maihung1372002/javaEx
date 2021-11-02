package oop;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    // contructor
    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // getter
    public String getName() {
        return name;
    }
    public Author[] getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public String getAuthorsName() {
        String auth = author[0].toString();
        for (int i = 1; i <= author.length; i++) {
            auth = auth + "," + author[i].toString();
        }
        return auth;
    }

    // setter
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        
        return "Book[name = " + name + 
        ", authors={" + this.getAuthorsName() + "}" +
        ", price = " + price + 
        ", qty = " +qty + "]";

    }
}
