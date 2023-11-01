package ex3;

public class Queen extends Piece {

    public Queen() {}

    public Queen(String name, Position pos) {
        super(name, pos);
    }

    public void fillPos() {
        legalPos.clear();

        for (int i = 1; i < 9; i++) {
            if (i != pos.y) {
                legalPos.add(new Position(pos.x, i));
            }
        }
        for (int i = 1; i < 9; i++) {
            if (i != pos.x) {
                legalPos.add(new Position(i, pos.y));
            }
        }
        for (int d = -8; d <= 8; d++) {
            int newX = pos.x + d;
            int newY = pos.y + d;

            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                legalPos.add(new Position(newX, newY));
            }

            newX = pos.x + d;
            newY = pos.y - d;

            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                legalPos.add(new Position(newX, newY));
            }
        }
        System.out.println(legalPos);
    }

	@Override
	public boolean isLegalMove(Position b) {
		// TODO Auto-generated method stub
		return super.isLegalMove(b);
	}
    
}

