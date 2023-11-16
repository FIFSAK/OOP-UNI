package ex5;
import practice2.Time;
public class Chocolate implements Comparable<Chocolate>{
	double weight;
	String name;
	
	public Chocolate(){}
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Chocolate o) {
		if(this.weight>o.weight) return 1;
		if(this.weight<o.weight) return -1;
		return 0;
	}
	
}
