package ex1;
import java.lang.Math.*;

public class Cylinder extends Shape {
	double high;
	double radius;
	
	public Cylinder() {}
	
	public Cylinder(double high, double radius) {
		this.high = high;
		this.radius = radius;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius*high;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return  Math.PI*radius*radius*2*2*Math.PI*radius*high;
	}
	
}
