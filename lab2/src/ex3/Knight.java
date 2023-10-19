package ex3;

public class Knight extends Piece{

		public Knight() {	
		}
		
		public Knight(String name, Position pos) {
			super(name, pos);
		}
		
		
		public void fillPos() {
			 int[][] knightMoves = {
			            {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
			            {1, -2}, {1, 2}, {2, -1}, {2, 1}
			        };

			        for (int[] move : knightMoves) {
			            int newX = pos.x + move[0];
			            int newY = pos.y + move[1];

			            // Ensure the new position is within the board boundaries
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
