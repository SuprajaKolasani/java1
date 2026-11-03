package logicalstatements;

import java.util.Scanner;

public class NthDigit {

	static void nthDigit(int n) {
		int d = 10;

		while (n > 0) {
			System.out.println(n);
			n = n / d;
		}
		d = d * 10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		nthDigit(n);
	}

}
