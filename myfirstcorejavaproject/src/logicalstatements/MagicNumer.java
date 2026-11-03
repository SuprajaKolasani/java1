package logicalstatements;

import java.util.Scanner;

public class MagicNumer {

	static int magicNum(int n) {
		int r=0;
		int sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		if(sum > 9) {
			return magicNum(sum);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int sum=magicNum(n);
		if(sum==1) {
			System.out.println("It's a magic number !!");
		}
		else {
			System.out.println("It's not a magic number..");
		}
	}

}
