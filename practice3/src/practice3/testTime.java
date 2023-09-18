package practice3;

public class testTime {

	public static void main(String[] args) {
		Time t = new Time(22,5,6);
		System.out.println(t.standard());
		System.out.println(t.universal());
		Time t2 = new Time(1,1,1);
		System.out.println(t.add(t2));
	}

}
