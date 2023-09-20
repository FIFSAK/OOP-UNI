package tests;

public class Student {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void method1 (Student a) {
		a.setName("Aray");
		} 
	public void method2 ( ) {
		Student b = new Student();
		b.setName("Adiya");
		method1(b); // now s is ?
		System.out.println(b.name);
		}
}

