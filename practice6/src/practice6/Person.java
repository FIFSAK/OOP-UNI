package practice6;

public class Person implements CanHavePizza {

	@Override
	public void eatPizza() {
		System.out.println("take my money");
		
	}
	
	public boolean pay() {
		return true;
	}
	
}
