package logicalstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int reverse=palindrome(n);
		
		if(n==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	static int palindrome(int n) {
		int r=0;
		int reverse=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			reverse=reverse*10+r;
		}
		return reverse;
	}

}
