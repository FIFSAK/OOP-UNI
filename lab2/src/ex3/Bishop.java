package ex3;

public class Bishop extends Piece {

    public Bishop() {}

    public Bishop(String name, Position pos) {
        super(name, pos);
    }

    public void fillPos() {
        legalPos.clear();

        // The bishop can move diagonally
        for (int d = -8; d <= 8; d++) {
            int newX = pos.x + d;
            int newY = pos.y + d;

            if (newX >= 61 && newX <= 68 && newY >= 1 && newY <= 8) {
                legalPos.add(new Position(newX, newY));
            }

            newX = pos.x + d;
            newY = pos.y - d;

            if (newX >= 61 && newX <= 68 && newY >= 1 && newY <= 8) {
                legalPos.add(new Position(newX, newY));
            }
        }
    }

	@Override
	public boolean isLegalMove(Position b) {
		// TODO Auto-generated method stub
		return super.isLegalMove(b);
	}

}

