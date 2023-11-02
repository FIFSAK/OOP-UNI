package ex5;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circuit a = new Resistor(3);
		Circuit b = new Resistor(3);
		Circuit c = new Resistor(3);
		Circuit d = new Resistor(3);
		Circuit e = new Resistor(2);
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		double R = circuit.getResistance();
		double V = 6.0;
		double I = V / R;
		System.out.println("Total Resistance in the Parallel Circuit: " + R + " Ohms");
		System.out.println("Current in the Circuit: " + I + " Amperes");
	}

}
