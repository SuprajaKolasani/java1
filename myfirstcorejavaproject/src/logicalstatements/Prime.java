package logicalstatements;

import java.util.Scanner;

public class Prime {

	static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find that prime number: ");
		int n=sc.nextInt();
		
		int count=0;
		int i=1;
		while(i>0) {
			if(isPrime(i)) {
				count++;
				if(count==n) {
					System.out.println(n + " prime number is "+i);
					break;
				}
			}
			i++;
		}
		

	}

}
