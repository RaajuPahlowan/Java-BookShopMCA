import java.lang.*;

public abstract class Book implements BookOperatrions{

    private String isbn;
    private String bookTitle;
    private String authurName;
    private double price;
    private int availableQuantity;

    public Book()
    {
      
    }

    public Book(String isbn, String bookTitle, String authurName, double price, int availableQuantity){
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authurName = authurName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setAuthurName(String authurName){
        this.authurName = authurName;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAvailableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }


    public String getIsbn(){
        return isbn;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthurName(){
        return authurName;
    }
    public double getPrice(){
        return price;
    }
    public int getAvailableQuantity(){
        return availableQuantity;
    }


    public abstract void showDetails();

    public void addQuantity(int amount)
    {
        int quantity = (int)(amount / this.price);
        this.availableQuantity += quantity;
    }
 
    public void sellQuantity(int amount)
    {
        int quantity = (int)(amount / this.price);
        this.availableQuantity -= quantity;
    }
 
}