package ex3;

public class Position {
	char ch;
	int x = ch;
	int y;
	
	public Position() {}
	public Position(char ch, int y) {
		this.ch = ch;
		this.y = y;
	}
	public Position(int x, int y) {
		this.x = x;
		this.ch = (char) x;
		this.y = y;
	}
}
