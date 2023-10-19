package ex3;

public class King extends Piece {


	public King() {}

    public King(String name, Position pos) {
        super(name, pos);
    }

    public void fillPos() {
        legalPos.clear();

        // Potential moves for a king
        int[][] kingMoves = {
            {-1, -1}, {-1, 0}, {-1, 1}, {0, -1},
            {0, 1}, {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] move : kingMoves) {
            int newX = pos.x + move[0];
            int newY = pos.y + move[1];

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

