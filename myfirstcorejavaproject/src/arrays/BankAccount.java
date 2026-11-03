package arrays;

public class BankAccount {
	String accountHolderName;
	double balance;
	
	public void setName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public String getName(){
		return accountHolderName;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
}
