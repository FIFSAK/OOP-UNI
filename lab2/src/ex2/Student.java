package ex2;

import java.util.Objects;

public class Student extends Person {
	String uni;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name, String uni) {
		super(age, name);
		this.uni = uni;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [uni=" + uni + super.toString();
	}

	@Override
	public int hashCode() {
//		return super.hashCode() + Objects.hash(uni);
		return Objects.hash(name, age, uni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(uni, other.uni);
	}
	
}
