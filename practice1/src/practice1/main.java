package practice1;
import java.util.Scanner;
public class main {
	public void printMyName(String name) {
		System.out.println("+---+");
		System.out.println("|" + name + "|");
		System.out.println("+---+");
	}
	public void square(int a) {
		System.out.println("area " + a*a);
		System.out.println("perimeter " + a*4);
		System.out.println("length of diagonal " + Math.pow((a*a)+(a*a), 0.5));
	}
	public String grade(int a) {
		if (a >= 90.0) {
            return "A";
        } else if (a >= 85.0) {
            return "A-";
        } else if (a >= 80.0) {
            return "B+";
        } else if (a >= 75.0) {
            return "B";
        } else if (a >= 70.0) {
            return "B-";
        } else if (a >= 65.0) {
            return "C+";
        } else if (a >= 60.0) {
            return "C";
        } else if (a >= 55.0) {
            return "C-";
        } else if (a >= 50.0) {
            return "D";
        } else {
            return "F";
        }
	}
	public void balance(double b, double per) {
		System.out.println(b*(1+per/100));
	}
	public void discriminant(double a, double b, double c) {
		// Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is negative
        if (discriminant < 0) {
            System.out.println("The discriminant is negative. The equation has no real roots.");
        } else if (discriminant == 0) {
            // Calculate and display the single real root
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
            // Calculate and display the two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
        }
	}
	public void polindrom(String s) {
		String s2 = "";
		char[] charArray = s.toCharArray();
		for(int i = s.length()-1;i>-1;i--) {
			s2+=charArray[i];
		}
		System.out.println(s.equals(s2));
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		main obj = new main();
//		obj.square(input.nextInt());
//		System.out.println(obj.grade(input.nextInt()));
//		
//	    double a = input.nextDouble();
//	    double b = input.nextDouble();
//	    double c = input.nextDouble();
//	    obj.discriminant(a, b, c);
//		obj.balance(100, 10);
//		obj.polindrom("asssa");
	}	
}
