package ex4;

public class test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		CheckingAccount a = new CheckingAccount(1);
		CheckingAccount b = new CheckingAccount(2);
		SavingAccount c = new SavingAccount(3);
		SavingAccount d = new SavingAccount(4);
		bank.openAcc(a);
		bank.openAcc(b);
		bank.openAcc(c);
		bank.openAcc(d);
		a.deposit(100);
		a.transfer(20, c);
		bank.update();
		System.out.println(bank);
	}	
}
