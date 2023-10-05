package ex5;

import java.util.Vector;

public class DragonLaunch {
	private static Vector<Person> persons = new Vector<Person>();
	static public void kidnap(Person p) {
		persons.add(p);
		
	}
	static public String willDragonEarOrNot() {
		int cnt = 0;
		for (int i = 0;i < persons.size(); i++) {
			if (i == 0 && persons.get(i).getGender()== "G") {
				cnt = 0;
				break;
			}
			else if(persons.get(i).getGender()== "B") {
				cnt+=1;
			}
			else if(persons.get(i).getGender()== "G") {
				cnt-=1;
			}
		}
		return cnt==0 ? "No" : "Yes";
	}
	
}
