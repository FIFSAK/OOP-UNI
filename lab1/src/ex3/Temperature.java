package ex3;

public class Temperature {
	private double val;
	private char scale;
	public Temperature() {
		val = 0;
		scale = 'C';
	}
	public Temperature(double val) {
		this.val = val;
		scale = 'C';
	}
	public Temperature(char scale) {
		this.scale = scale;
		val = 0;
	}
	public Temperature(double val, char scale) {
		this.val = val;
		this.scale = scale;
		
	}
	public double inC() {
		if(scale == 'C') {
			return val;
		}
		else {
			return 5*(val-32)/9;
		}
	}
	public double inF() {
		if(scale == 'F') {
			return val;
		}
		else {
			return 9*(val/5)+32;
		}
	}
	public void setData(double val) {
		this.val = val;
	}
	public void setData(char scale) {
		this.scale = scale;
	}
	public void setData(double val, char scale) {
		this.scale = scale;
		this.val = val;
	}
//	public double getVal() {
//		return val;
//	}
	public char getScale(char scale) {
		return scale;
	}
	
}
