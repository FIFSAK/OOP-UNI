package ex5;

public class Person {
	Gender gender = new Gender();
	public Person(String gender) {
		this.gender.setGender(gender);
	}
	public String getGender() {
		return gender.getGender();
	}
	public String toString() {
		return "gender is " + gender;
	}
}
