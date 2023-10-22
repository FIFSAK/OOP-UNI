package ex5;

public class Parallel extends Resistor {
	double r;
	public Parallel(int r1, int r2) {
		r = 1/(1/r1+1/r2);
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
