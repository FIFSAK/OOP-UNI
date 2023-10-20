package ex4;

public class SavingAccount extends Account{
	double interestRate = 0.1;
	
	
	public SavingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void addInterest() {
		deposit(getBalance()*(1+interestRate)-getBalance());
	}
	
}
