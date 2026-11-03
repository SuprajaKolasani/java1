package logicalstatements;

import java.util.Scanner;

public class AlternatePrime {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = sc.nextInt();
		
		int count=0;
//		for (int i = 0; i <= n; i++) {
//			if (isPrime(i)) {
//				count++;
//				
//				if(count%2!=0) {
//					System.out.println(i);
//				}
//			}
//		}
		
		int flag=0;
		
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				if(flag==0) {
					System.out.println(i);
					flag=1;
				}
				else {
					flag=0;
				}
			}
		}
	}

}
