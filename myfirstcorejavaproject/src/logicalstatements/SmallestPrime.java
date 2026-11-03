package logicalstatements;

import java.util.Scanner;

public class SmallestPrime {

	static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting number(range): ");
		int start = sc.nextInt();

		System.out.println("Enter the ending number(range): ");
		int end = sc.nextInt();
		
		System.out.println("Enter a number to print that position prime number:");
		int n=sc.nextInt();
//		for(int i=start;i<=end;i++) {
//			if(isPrime(i)) {
//				System.out.println("Smallest: "+i);
//				break;
//			}
//		}
		
		
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				count++;
				if(count==n) {
					System.out.println("nth prime in given range: "+i);
				}
			}
		}
		
		
	
//		int largest = 0;
//		for (int i = start; i <= end; i++) {
//			if (isPrime(i)) {
//				System.out.print(i+" ");
//				if(largest<i) {
//					largest=i;
//				}
//			}
//		}
//		System.out.println("largest: "+largest);
	}

}
