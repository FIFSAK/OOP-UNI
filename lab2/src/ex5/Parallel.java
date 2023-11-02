package ex5;

public class Parallel extends Resistor {
	public Parallel(int r1, int r2) {
		r = 1/(1/r1+1/r2);
	}
	public Parallel(Circuit c, Circuit d) {
		// TODO Auto-generated constructor stub
		r = 1/(1/c.getResistance() + 1/d.getResistance());
	}
	@Override
	public double getResistance() {
		return super.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return super.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		super.applyPotentialDiff(V);
		
	}
}
