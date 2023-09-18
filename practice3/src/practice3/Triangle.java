package practice3;

public class Triangle {
	int width;
	
	public Triangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		String symbol = "[*]";
		String result = "";
		for(int i = 0; i < width; i++) {
			for(int j = 0; j<i; j++) {
				result += symbol;
			}
			result += "\n";
		}
		return result;
	}
}
