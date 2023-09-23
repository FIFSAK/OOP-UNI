package ex5;

import java.util.Scanner;

public class testDragon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DragonLaunch.kidnap(new Person("B"));
		DragonLaunch.kidnap(new Person("B"));
		DragonLaunch.kidnap(new Person("G"));
		DragonLaunch.kidnap(new Person("G"));
		System.out.println(DragonLaunch.willDragonEarOrNot());
	}

}
