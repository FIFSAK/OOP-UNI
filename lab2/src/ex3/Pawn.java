package ex3;

public class Pawn extends Piece {
	
	public Pawn() {	
	}
	
	public Pawn(String name, Position pos) {
		super(name, pos);
	}
	
	
	public void fillPos() {
		if (pos.y == 2) {
			legalPos.add(new Position(pos.ch, pos.y+2));
		}
		legalPos.add(new Position(pos.ch, pos.y+1));
	}
	
	
	@Override
	public boolean isLegalMove(Position b) {
		// TODO Auto-generated method stub
		return super.isLegalMove(b);
	}
	
	
	
}
