import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class BookManager {
    private List<Book> bookList;
    
    public BookManager() {
        bookList = new BookCatalog().getCatalog();
    }
    
    
    public List<Book> getBooks(Predicate<Book> condition) {
    	List<Book> filteredBooks = new ArrayList<>();
		for (Book b: bookList) {
			//passing the lambda condition into the method and takes place of condition.test
			if (condition.test(b)) {
				filteredBooks.add(b);
			}
		}
    	
    	return filteredBooks;
    	
    }
    	
    
}