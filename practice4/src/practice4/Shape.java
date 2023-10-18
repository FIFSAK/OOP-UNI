package practice4;

public abstract class Shape {
	Color color;
	int pos;
	String type="";
	public Shape() {
		
	}
	public Shape(Color color, int pos) {
		this.color = color;
		this.pos = pos;
	}
	void draw() {
		String space = "";
		for(int i =0;i<pos;i++) {
			space += " ";
		}
		if (color == Color.RED) {
			System.err.println(space + type);
		}
		else {
			System.out.println(space + type);
		}
	}
}
