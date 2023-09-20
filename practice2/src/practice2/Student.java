package practice2;

class Student {
	private int id;
	String name;
	int year_of_study;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}
	public void incrYear() {
		year_of_study++;
	}
//	public String to_string() {
//		return this.id + " " + this.name + " " this.year_of_study;
//	}
}
