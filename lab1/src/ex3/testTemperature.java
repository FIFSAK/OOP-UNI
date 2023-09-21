package ex3;

public class testTemperature {

	public static void main(String[] args) {
		Temperature t = new Temperature('F');
		t.setData(68);
		System.out.println(t.getScale());
		System.out.println(t.inC());

	}

}
