package practice6;

public class test {

	public static void main(String[] args) {
		Cat c = new Cat();
		Person p = new Person();
		Restaurant r = new Restaurant();
		System.out.println(r.servePizza(p));
		System.out.println(r.servePizza(c));
		
	}

}
