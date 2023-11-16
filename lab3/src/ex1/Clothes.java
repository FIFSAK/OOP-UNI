package ex1;

import java.util.Vector;

public abstract class Clothes {
	String name;
	int count;
	int id;
	Vector<Size> sizes = new Vector<Size>();
	
	public Clothes(String name, int count, int id, Vector<Size> sizes) {
		this.name = name;
		this.count = count;
		this.id = id;
		this.sizes = sizes;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[name=" + name + ", count=" + count + ", id=" + id + ", sizes=" + sizes + "]";
	}
}
