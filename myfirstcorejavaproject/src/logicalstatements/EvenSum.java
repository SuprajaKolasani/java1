package logicalstatements;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int r=0;
		int sum=0;
		int count=0;
		
		while(n>0) {
			r=n%10;
			if(count%2==0) {
				sum=sum+r;
			}
			n=n/10;
			count++;

		}
		
		System.out.println("Even positioned sum: "+sum);

	}

}
