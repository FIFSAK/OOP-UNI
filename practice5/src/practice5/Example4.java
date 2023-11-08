package practice5;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		double leftOperand, result, rightOperand;
		String leftString, operator, rightString, space;
		StringTokenizer tokenizer;
		Scanner in = new Scanner(System.in);

		tokenizer = new StringTokenizer(in.nextLine(), "+-*/   ", true);

		try {
			while (tokenizer.hasMoreTokens()) {

				leftString = tokenizer.nextToken();
				operator = tokenizer.nextToken();
				rightString = tokenizer.nextToken();
				if (tokenizer.hasMoreTokens())
					space = tokenizer.nextToken();
				try {

					leftOperand = Double.parseDouble(leftString);
				} 
				catch (NumberFormatException nfe) {
					System.out.println("One or more operands is not a number " + leftString);
					break;
				}
				try {

					rightOperand = Double.parseDouble(rightString);
				} 
				catch (NumberFormatException nfe) {
					System.out.println("One or more operands is not a number " + rightString);
					break;
				}
				if (operator.equals("+"))
					result = leftOperand + rightOperand;
				else if (operator.equals("-"))
					result = leftOperand - rightOperand;
				else if (operator.equals("*"))
					result = leftOperand * rightOperand;
				else if (operator.equals("/"))
					result = leftOperand / rightOperand;
				else
					result = 0.0;

				System.out.println("Result: " + result);
			}
		} catch (NoSuchElementException nsee) {
			System.out.println("Invalid syntax");
		} catch (NumberFormatException nfe) {
			System.out.println("One or more operands is not a number");
		}

	}
}
