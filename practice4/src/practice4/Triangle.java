package practice4;

public class Triangle extends Shape {
	public Triangle(Color color, int pos) {
		super(color, pos);
	}

	@Override
	void draw() {
		String space = "";
		for(int i =0;i<pos;i++) {
			space += " ";
		}
		if (color == Color.RED) {
			System.err.println(space + "/_\\");
		}
		else {
			System.out.println(space + "/_\\");
		}
	}
}
