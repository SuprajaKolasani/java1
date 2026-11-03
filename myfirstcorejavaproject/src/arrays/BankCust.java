package arrays;

public class BankCust {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		
		b1.setName("Anith");
		b1.setBalance(789688.0);
	
		System.out.println(b1.getName());
		System.out.println(b1.getBalance());
	}

}
