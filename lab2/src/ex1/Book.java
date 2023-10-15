package ex1;

public class Book extends LibraryItem {
	int page;
	
	public Book() {
		
	}
	public Book(String title, String author, int publicatonYear, int page) {
		super(title, author, publicatonYear);
		this.page = page;
	}
}
