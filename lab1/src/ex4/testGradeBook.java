package ex4;

import practice2.Student;

import java.util.Scanner;
import java.util.Vector;

public class testGradeBook {
	public static void printGradeDistribution(GradeBook book) {
	    int[] gradeCounts = new int[11]; // 11 ranges: 00-09, 10-19, ..., 100

	    // Count the number of students in each grade range
	    for (Student student : book.getStudents()) {
	        int grade = student.getGrade();
	        gradeCounts[grade / 10]++;
	   
	    }

	    // Print the distribution
	    System.out.println("Grades distribution:");
	    for (int i = 0; i < 10; i++) {
	        System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
	        for (int j = 0; j < gradeCounts[i]; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    System.out.printf("100: ");
	    for (int j = 0; j < gradeCounts[10]; j++) {
	        System.out.print("*");
	    }
	    System.out.println();
	}

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
			String temp = "Student  " + book.getStudent(i) + ": ";
			System.out.print(temp);
			grade = input.nextInt();
			book.setGrade(grade, i);
//			System.out.print("");
		}
		System.out.println(book.displayGradeReport());
		printGradeDistribution(book);
	}

}
