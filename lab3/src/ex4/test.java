package ex4;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d = new Date(2000, 2, 2);
		Vector<Employee> v = new Vector<Employee>();
		Vector<Employee> v2 = new Vector<Employee>();
		
		Person p = new Person("asa");
		Person p2 = new Person("asa");
		
		System.out.println(p);
		System.out.println(p.equals(p2));
		
		Employee e = new Employee(100, d,"a",  "aaa");
		Employee e2 = new Employee(100, d,"a",  "aaa");
		
		System.out.println(e);
		System.out.println(e.equals(e2));
		
		Manager m = new Manager(100, d,"a",  "a", 10);
		m.addEmployee(e);
		Manager m2 = new Manager(100, d,"a",  "b", 10);
		m2.addEmployee(e2);
		
		System.out.println(m);
		System.out.println(m.equals(m2));
		
		Vector<Manager> temp = new Vector<Manager>();
		
		temp.add(m2);
		temp.add(m);
		
		System.out.println(temp);
		Collections.sort(temp, new NameComparator());
		System.out.println(temp);
		
		Manager c = (Manager) m.clone();
		c.salary = 200;
		System.out.println(c);
		System.out.println(m);
		Employee c2 = (Employee) e.clone();
		c2.salary = 1000;
		System.out.println(c2);
		System.out.println(e);
		

	}

}
