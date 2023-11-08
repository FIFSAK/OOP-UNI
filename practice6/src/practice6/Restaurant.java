package practice6;

public class Restaurant {
	boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if (eater instanceof Person) {
			Person p = (Person)eater;
			return p.pay();
		}
		return false;
	}

}

