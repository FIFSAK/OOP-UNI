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
        
        HashSet<Person> hset = new HashSet<>();
        
        // Adding objects to HashSet
        hset.add(person1);
        hset.add(person2);  // duplicate
        hset.add(person3);
        hset.add(student1);
        hset.add(student2);  // duplicate
        hset.add(student3);
        
        // Checking the size of HashSet
        System.out.println(hset);  // It should be 4 as two entries are duplicates
        System.out.println(person1.equals(person2));

        	
	}

}
