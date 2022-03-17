import java.lang.*;

public class StoryBook extends Book {

    private String catergory;

    public StoryBook(){

    }
        public StoryBook(String isbn, String bookTitle, String authurName, double price, int availableQuantity, String catergory){
        super(isbn, bookTitle, authurName, price, availableQuantity);
        this.catergory = catergory;
    }


    public void setCategory(String catergory){
    	this.catergory = catergory;
    }


    public String getCategory(){
    	return catergory;
    }


        public void showDetails(){ 
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("Book Title: " + super.getBookTitle());
        System.out.println("Authur Name: " + super.getAuthurName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Available Quantity: " + super.getAvailableQuantity());
        System.out.println("Category:" + catergory);

    }
}