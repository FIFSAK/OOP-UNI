package ex4;

import java.util.Vector;

public class Bank {
	private Vector<Account> v = new Vector<Account>();
	public void update() {
		for(Account cur: v) {
			if(cur instanceof SavingAccount) {
				((SavingAccount) cur).addInterest();
			}
			if(cur instanceof CheckingAccount) {
				((CheckingAccount) cur).deductFee();
			}
		}
	}
	
	public void openAcc(Account acc) {
		if(acc instanceof SavingAccount) {
			v.add((SavingAccount) acc);
		}
		if(acc instanceof CheckingAccount) {
			v.add((CheckingAccount) acc);
		}
	}
	public void closeAcc(double a) {
		for(Account cur: v) {
			if(cur.getAccountNumber() == a) {
				v.remove(cur);
			}
		}
	}
	
	public String toString() {
		return v.toString();
	}
}
