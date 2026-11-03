package casestudies;

import java.util.Scanner;

public class ShoppingCart {

	String pName;
	double price;
	int quantity;
	
	ShoppingCart(){
	}
	
	ShoppingCart(String pName, double price, int quantity){
		this.pName=pName;
		this.price=price;
		this.quantity=quantity;
		
		double finalBill= this.price * this.quantity;
		if(finalBill > 5000) {
			finalBill = finalBill-(finalBill *10)/100;  
		}
		System.out.println("Final Bill: "+finalBill);
	}
	
	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
		System.out.println("Enter Priduct name: ");
		pName=sc.nextLine();
		
		System.out.println("Enter price: ");
		price=sc.nextDouble();
		
		System.out.println("Enter quantity: ");
		quantity=sc.nextInt();
		
		sc.nextLine();
		ShoppingCart sh=new ShoppingCart(pName, price, quantity);
		}
		
	}
}
