package problem2;
import java.util.Scanner;
import java.util.Vector;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Vector <Person> persons = new Vector<Person>();
		Person p = new Person("A", "123");
		persons.add(p);
		Student s = new Student("S", "333", "it", 1, 2.5);
		persons.add(s);
		Staff st = new Staff("ST", "222", "93", 4.2);
		persons.add(st);
		System.out.println(persons);
//		System.out.println("inset 1 add new 2");
//		int temp = input.nextInt();
//		if(temp==1) {
//			
//		}
//		if(temp==2) {
//			
//		}
	}

}
