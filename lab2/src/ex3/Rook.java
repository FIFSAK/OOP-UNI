package ex3;

public class Rook extends Piece{
	public Rook() {	
	}
	
	public Rook(String name, Position pos) {
		super(name, pos);
	}
	
	
	public void fillPos() {
		for(int i = 1;i<9;i++) {
			if (i!= pos.y){		
				legalPos.add(new Position(pos.x, i));			
			}
		}
		for(int i = 1; i < 9;i++) {
			if(i!=pos.x) {
				legalPos.add(new Position(i, pos.y));
			}
		}
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		// TODO Auto-generated method stub
		return super.isLegalMove(b);
	}
}
