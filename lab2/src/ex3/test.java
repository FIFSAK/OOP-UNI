package ex3;

public class test {

	public static void main(String[] args) {
		Position p = new Position(5, 5);
		Bishop q = new Bishop("pawn", p);
		q.fillPos();
		Position p2 = new Position(1, 3);
		System.out.println(q.legalPos);
		System.out.println(q.isLegalMove(p2));
		

	}

}
