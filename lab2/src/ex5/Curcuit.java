package ex5;

public abstract class Curcuit {

	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return getPotentialDiff()*getPotentialDiff()/getResistance();
	}
	public double getCurrent() {
		return getCurrent()/getResistance();
	}
	 
}
