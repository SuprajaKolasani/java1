package logicalstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int factorial=findFact(n);
		System.out.println("Factorial of " +n + " is "+factorial);

	}
	
	
	static int findFact(int n) {
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
				fact=fact*i;
		}
		
		return fact;
	}

}


//static int findFact(int n) {
//if(n==0 || n==1) {
//	return 1;
//}
//
////int fact=1;
////for(int i=1;i<=n;i++) {
////	fact=fact*i;
////}
////return fact;
//
//return n*findFact(n-1);
//}