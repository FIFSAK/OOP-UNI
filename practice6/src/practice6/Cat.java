package practice6;

public class Cat extends Animal implements CanHavePizza{

	@Override
	public void voice() {
		System.out.println("meow");
	}

	@Override
	public void eatPizza() {
		System.out.println("happy 'meow'");
		
	}

}
