package logicalstatements;

import java.util.Scanner;

public class NthDigitPrimeNum {

	static void nthDigit(int n) {
		int d = 10;

		while (n > 0) {
			if (isPrime(n)) {
				System.out.println(n);
			}
			n = n / d;
		}
		d = d * 10;
	}

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		nthDigit(n);
	}

}
