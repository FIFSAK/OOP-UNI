package ex4;

public class CheckingAccount extends Account {
	double charge =0.02;
	int counterTransactions;
	int counterFreeTransactions;
	
	public CheckingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		counterTransactions+=1;
	}
	public void deductFee() {
		withdraw(charge*counterTransactions);
	}
	
}
