package ex4;
import java.util.Vector;

import practice2.Student;
public class GradeBook {
	static Course course;
	private Vector<Student> students;
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
	private String maxName;
	private String minName;
	{
		students = new Vector<Student>();
	}
	public GradeBook() {
		
	}
	public GradeBook(Course c) {
		this.course = c;
	}
	public GradeBook(Student student, Course course) {
		this.course = course;
	    students.add(student);
	    updateMinMax(student);
	}
	private void updateMinMax(Student student) {
	    if (student.getGrade() > max) {
	        max = student.getGrade();
	        maxName = student.getName();
	    }
	    if (student.getGrade() < min) {
	        min = student.getGrade();
	        minName = student.getName();
	    }
	}
	public void addStudent(int id, String name) {
		Student s = new Student(id, name);
	    students.add(s);
	    
	}
	public String displayMessage() {
		return "Welcome to the grade book for CS101 "
				+ course.getName();
	}
	public String averageGrade() {
		double sumGrade = 0;
		for(Student cur: students) {
			sumGrade += cur.getGrade();
		}
		double average = sumGrade/students.size();
		return String.format("%.2f", average);
	}
	public String displayGradeReport() {
		
		return "Class average is " + averageGrade() + ". Lowest grade is " + min + " " + minName + ". Highest grade is " + max + " " + maxName;
	}
	public String toString() {
		return students.toString() + course.toString();
	}
	public void setGrade(int grade, int i) {
		Student s = students.get(i);
	    s.setGrade(grade);
	    updateMinMax(s);
	}
	public Vector<Student> getStudents() {
		return students;
	}
	public String getStudent(int i) {
		return students.get(i).getName();
		
	}
}
