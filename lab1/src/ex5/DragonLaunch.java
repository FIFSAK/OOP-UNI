package ex5;

import java.util.Vector;

public class DragonLaunch {
	private static Vector<Person> persons = new Vector<Person>();
	static public void kidnap(Person p) {
		if(p.getGender() == "G" && persons.lastElement().getGender() == "B") {
			persons.remove(persons.size()-1);
		}
		else {
			persons.add(p);
		}
		
	}
	static public String willDragonEarOrNot() {
		
		return persons.isEmpty()? "No" : "Yes";
	}
	
}
