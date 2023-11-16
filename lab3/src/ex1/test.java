package ex1;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
		Student s = new Student("Jone", 12);
		System.out.println(s.go());
		System.out.println(s.eat());
		Vector<Size> v = new Vector<Size>();
		Size size = new Size();
		size.size = "s";
		Size size2 = new Size();
		size.size = "m";
		v.add(size2);
		Dress d = new Dress("Black", 2, 1, v);
		System.out.println(d);
	}

}
