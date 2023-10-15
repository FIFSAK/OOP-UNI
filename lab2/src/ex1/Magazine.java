package ex1;

public class Magazine extends LibraryItem {
	String type;
	
	public Magazine() {}
	public Magazine(String title, String author, int publicatonYear, String type) {
		super(title, author, publicatonYear);
		this.type = type;
	}
}
