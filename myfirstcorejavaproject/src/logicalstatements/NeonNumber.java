package logicalstatements;

import java.util.Scanner;

public class NeonNumber {

	static int neonNum(int n) {
		int sq=(int) Math.pow(n, 2);
		
		int r=0;
		int sum=0;
		
		while(sq>0) {
			r=sq%10;
			sq=sq/10;
			sum=sum+r;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int sum=neonNum(n);
		if(sum==n) {
			System.out.println("It's a neon number !!");
		}
		else {
			System.out.println("Not a neon number..");
		}
	}

	
}
