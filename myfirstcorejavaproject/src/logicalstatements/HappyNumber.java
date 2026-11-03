package logicalstatements;

import java.util.Scanner;

public class HappyNumber {
  
	static int happy(int n) {
		int r=0;
		int sum=0;
		while(n>0) { 
			r=n%10;
			n=n/10;
			sum=(int) (sum+ Math.pow(r, 2));
		}
		if(sum > 9) {
			return happy(sum);
		}  
		return sum;
	}  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int sum= happy(n);
		if(sum==1) {
			System.out.println("Happy number !!");
		}else {
			System.out.println("Not a happy number..");
		}
	}

}
