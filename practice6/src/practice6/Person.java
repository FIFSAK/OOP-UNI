package practice6;

public class Person implements CanHavePizza, Thanksgiving{

	@Override
	public void eatPizza() {
		System.out.println("take my money");
		
	}
	
	public boolean pay() {
		return true;
	}

	@Override
	public String thanks() {
		// TODO Auto-generated method stub
		return "thank you";
	}
	
}
