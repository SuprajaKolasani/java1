package logicalstatements;

import java.util.Scanner;

public class StrongNumber {

	static int fact(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
//		int fact = 1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		return fact;
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int temp=n;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			int strong=fact(r);
			sum=sum+strong;
			n=n/10;
		}
		
		if(sum==temp) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a strong number");
		}
	}

}
