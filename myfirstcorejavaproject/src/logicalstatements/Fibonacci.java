package logicalstatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = sc.nextInt();

		findFibo(n);
	}

	static void findFibo(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		int n3=0;
		for (int i = 1; i <= n-2; i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			
			
			n1 = n2;
			n2 = n3;
		}
	}

}
