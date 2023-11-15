package practice6;

public class Cat extends Animal implements CanHavePizza, Thanksgiving{

	@Override
	public void voice() {
		System.out.println("meow");
	}

	@Override
	public void eatPizza() {
		System.out.println("happy 'meow'");
		
	}

	@Override
	public String thanks() {
		// TODO Auto-generated method stub
		return "thanks 'meow'";
	}

}
