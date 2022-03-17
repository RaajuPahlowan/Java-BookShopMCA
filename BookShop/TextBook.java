import java.lang.*;

public class TextBook extends Book {

    private int standard;

    public TextBook(){

    }
        public TextBook(String isbn, String bookTitle, String authurName, double price, int availableQuantity, int standard){
        super(isbn, bookTitle, authurName, price, availableQuantity);
        this.standard = standard;
    }


    public void setStandard(int standard){
    	this.standard = standard;
    }


    public int getStandard(){
    	return standard;
    }


        public void showDetails(){ 
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Book Title: " + this.getBookTitle());
        System.out.println("Authur Name: " + this.getAuthurName());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Available Quantity: " + this.getAvailableQuantity());
        System.out.println("Standard:" + standard);

    }
}