package lab1;

public class Data {
	private double iter;
	private double allnum;
	private int max;
	public Data() {}
	public void setNum(int n) {
		allnum += n;
		iter++;
		if (iter==1) {
			max = n;
		}
		if (n>max) {
			max = n;
		}
	}
	public double getIter() {
		return iter;
	}
	public double getNum() {
		return allnum;
	}
	public int maxValue() {
		return max;
	}
}
