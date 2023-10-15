package ex1;

public class Cube extends Shape{
	double edge;
	
	public Cube() {};
	
	public Cube(double edge) {
		this.edge = edge;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return edge*edge*edge;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return edge*edge*6;
	}
	
}
