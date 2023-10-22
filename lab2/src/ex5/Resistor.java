package ex5;

public class Resistor extends Curcuit{
	double r;
	private double v;
	public Resistor() {};
	public Resistor(double r) {
		this.r = r;
	}
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return r;
	}
	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return v;
	}
	@Override
	public void applyPotentialDiff(double V) {
		this.v = V;
	}
}
