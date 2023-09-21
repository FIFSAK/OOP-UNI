package ex2;

public class Card {
	static final private String material = "plastic";
	private int cvc; //will read only
	public String name;
	public Colors color = Colors.BLACK;
	private int pass;
	{
		cvc++;
	}
	public Card(Colors color, String name){
		this.color = color;
		this.name = name;
	}
	
	 public int getCvc(int cvc){
		return cvc;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public void setPass(double pass) {
		this.pass = (int) pass;
	}
	public String toString() {
		return this.cvc + " " + this.name + " " + this.color + " " +
	this.pass;
	}
}
