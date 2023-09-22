package ex4;

import practice2.Student;

import java.util.Scanner;
import java.util.Vector;

public class testGradeBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Course c = new Course("OOP", "the best course", 10, "pp1");
		int grade;
		GradeBook book = new GradeBook(c);
		book.addStudent(1, "Anuar");
		book.addStudent(2, "Bnuar");
		book.addStudent(3, "Cnuar");
		book.addStudent(4, "Dnuar");
		book.addStudent(5, "Enuar");
		book.addStudent(6, "Fnuar");
		
		for(int i = 0; i<6;i++) {
			grade = input.nextInt();
			book.setGrade(grade, i);
		}
		System.out.println(book);
		System.out.println(book.displayGradeReport());

	}

}
