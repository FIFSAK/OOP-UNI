package ex2;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		
		Person person1 = new Person(25, "John");
        Person person2 = new Person(25, "John");
        Person person3 = new Person(26, "Doe");
        
        Student student1 = new Student(20, "Alice", "MIT");
        Student student2 = new Student(20, "Alice", "MIT");
        Student student3 = new Student(21, "Bob", "Harvard");
        
        HashSet<Person> set = new HashSet<>();
        
        // Adding objects to HashSet
        set.add(person1);
        set.add(person2);  // duplicate
        set.add(person3);
        set.add(student1);
        set.add(student2);  // duplicate
        set.add(student3);
        
        // Checking the size of HashSet
        System.out.println(set);  // It should be 4 as two entries are duplicates

        	
	}

}
