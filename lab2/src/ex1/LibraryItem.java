package ex1;

public abstract class LibraryItem {
	String title;
	String author;
	int publicationYear;
	
	public LibraryItem() {
		
	}
	public LibraryItem(String title, String author, int publicatonYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicatonYear;
	}
	
}
