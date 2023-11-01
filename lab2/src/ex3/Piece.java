package ex3;

import java.util.Vector;

public abstract class Piece {
	String name = "";
	Position pos;
	Vector<Position> legalPos = new Vector<Position>();
	
	public Piece() {}
	public Piece(String name, Position pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public boolean isLegalMove(Position b) {
		return legalPos.contains(b);
	}
}
