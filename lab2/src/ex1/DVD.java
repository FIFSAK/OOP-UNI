package ex1;

public class DVD extends LibraryItem {
	int memory;
	
	public DVD() {}
	
	public DVD(String title, String author, int publicatonYear, int memory) {
		super(title, author, publicatonYear);
		this.memory = memory;
	}
}
