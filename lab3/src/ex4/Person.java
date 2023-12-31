package ex4;

import java.util.Objects;

public class Person {
	String name;
	
	public Person() {}

	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}
	
}
