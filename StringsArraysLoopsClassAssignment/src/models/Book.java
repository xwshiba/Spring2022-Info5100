package models;

public class Book {
    private String name;
    private int bookID;
    private String genres;
    private double price;

    public Book(String nm, int id, String gen, double p){
        this.name = nm;
        this.bookID = id;
        this.genres = gen;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public int getBookID() {
        return bookID;
    }

    public String getGenres() {
        return genres;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printBookInfo(){
        System.out.println("Book name: " + name + " | Book Id: " + bookID + " | Book Genres : " + genres + " | Book price: $" + price);
    }
}
