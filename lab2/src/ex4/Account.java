package ex4;

public class Account {
	private double balance;
	private int accNumber;
	
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	public void deposit(double sum) {
		balance+=sum;
	}
	public void withdraw(double sum) {
		balance-=sum;
	}
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		if(balance-amount<0) {
			return;
		}
		balance-=amount;
		other.deposit(amount);
	}
	public String toString() {
		return balance + " " + accNumber;
	}
	public final void print() {
		System.out.println(toString());
	}
}
