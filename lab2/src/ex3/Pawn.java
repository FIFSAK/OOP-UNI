package ex3;

public class Pawn extends Piece {
	
	public Pawn() {	
	}
	
	public Pawn(String name, Position pos) {
		super(name, pos);
	}
	
	
	public void fillPos() {
		if (pos.y == 2) {
			legalPos.add(new Position(pos.x, pos.y+2));
		}
		legalPos.add(new Position(pos.x, pos.y+1));
	}
	
	
	@Override
	public boolean isLegalMove(Position b) {
		return super.isLegalMove(b);	
		}
}
