import java.lang.*;

public interface BookShopOperations
{
	boolean insertBook(Book b);
	boolean removeBook(Book b);
	Book searchBook(String isbn);
	void showAllBooks();
}