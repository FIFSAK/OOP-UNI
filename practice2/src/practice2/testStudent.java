package practice2;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1, "anuar", 1);
		System.out.println(s.year_of_study);

		s.incrYear();
		System.out.println(s.year_of_study);
		
	}

}
