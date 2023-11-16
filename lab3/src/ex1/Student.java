package ex1;

public class Student extends Person implements GoUni, Eatable{

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public boolean go() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		return true;
	}

}
