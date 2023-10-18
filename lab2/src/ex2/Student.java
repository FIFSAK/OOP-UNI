package ex2;

import java.util.Objects;

public class Student extends Person {
	String uni;

	@Override
	public String toString() {
		return "Student [uni=" + uni + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(uni);
		return result;
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
