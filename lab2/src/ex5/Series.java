package ex5;

public class Series extends Resistor{
	double r;
	public Series(int r1, int r2) {
		r = r1+r2;
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
