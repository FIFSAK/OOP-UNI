package ex1;
import java.lang.Math.*;
public class Sphere extends Shape {
	double radius;
	
	public Sphere() {}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(radius, 2);
	}
	
}


