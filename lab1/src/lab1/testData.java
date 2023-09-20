package lab1;
import java.util.Scanner;

public class testData {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		Data num = new Data();
		while(!str.equals("Q")) {
			num.setNum(Integer.parseInt(str));
			str = input.next();
		}
		System.out.println(Analyzer.average(num.getNum(),num.getIter()));
		System.out.println(Analyzer.max(num.maxValue()));
	}

}
