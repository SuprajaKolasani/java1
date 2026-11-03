package casestudies;

import java.util.Scanner;

public class BankAccount {
	long accNumber;
	String customerName;
	double balance;

	double deposit(double depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}

	double withdraw(double withdrawAmount) {
		balance = balance - withdrawAmount;
		return balance;
	}

	double transfer(double transferAmount) {
		balance = balance - transferAmount;
		return balance;
	}

	double interest(float interestRate) {
		double interest = (balance * interestRate * 1) / 100;
		return interest;
	}

	void displayDetails() {
		System.out.println("Customer acc number: " + accNumber);
		System.out.println("Custoner name: " + customerName);
		System.out.println("Total remaining balance: " + balance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		
		b1.accNumber=537865378;
		b1.customerName="Rohan";
		b1.balance = 10000;
		b1.displayDetails();
		System.out.println("Enter deposit amount: ");
		double depositAmt = sc.nextDouble();
		double deposit=b1.deposit(depositAmt);
		System.out.println("Remaining balance after deposit: "+deposit);
		
		
		System.out.println("Enter withdrawal amount: ");
		double withdrawAmt = sc.nextDouble();
		double withdraw=b1.withdraw(withdrawAmt);
		System.out.println("Total balance after withdrawal: "+withdraw);
		
		System.out.println("Enter amount to transfer: ");
		double transferAmt = sc.nextDouble();
		double transfer=b1.transfer(transferAmt);
		System.out.println("Remaining amount after transfer: "+ transfer);
		
		System.out.println("Enter interest rate: ");
		float interestPercent = sc.nextFloat();
		double simpleInterest = b1.interest(interestPercent);
		System.out.println("Interest amount: " + simpleInterest);
		double interesst=b1.interest(interestPercent);
		System.out.println("Total interest: "+interesst);
		System.out.println("-------------------------------------------------");
		
		BankAccount b2 = new BankAccount();
		b2.accNumber=874736739;
		b2.customerName="Saran";
		b2.balance=20000;
		b2.displayDetails();
		double b2Deposittt=b2.deposit(transferAmt);
		System.out.println("Total balance after received from object 1: "+b2Deposittt);
		
		System.out.println("Eneter withdrawal amount: ");
		double withdrawAmtt = sc.nextDouble();
		double secWithdraw=b2.withdraw(withdrawAmtt);
		System.out.println("Remaining amount after withdrawal: "+secWithdraw);
		
		System.out.println("Enter amount to transfer: ");
		double transferAmtt = sc.nextDouble();
		double secTransfer=b2.transfer(transferAmtt);
		System.out.println("Remaining amount after transfer: "+secTransfer);
		
		System.out.println("Enter interest rate: ");
		float interestPercentt = sc.nextFloat();
		double simpleInterestt = b2.interest(interestPercentt);
		System.out.println("Interest amount: " + simpleInterestt);
		double secInterest=b2.interest(interestPercentt);
		System.out.println("Total interest: "+secInterest);
		sc.close();	}

}
