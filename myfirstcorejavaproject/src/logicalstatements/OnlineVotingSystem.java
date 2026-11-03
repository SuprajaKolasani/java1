package logicalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age > 18) {
			System.out.println("Enter your gender(M/F): ");
			char gender=sc.next().charAt(0);
			if(gender=='M' || gender=='F' || gender=='m' || gender=='f') {
				System.out.println("Enter your voter Id:");
				int voterId=sc.nextInt();
				
				System.out.println("Choose one: ");
				System.out.println("1. TDP");
				System.out.println("2. JSP");
				System.out.println("3. YCP");
				System.out.println("4. BJP");
				
				System.out.println("Enter the respective party number to vote: ");
				int party=sc.nextInt();
				
				switch(party) {
				case 1 -> System.out.println("Voted successfully! You have voted to TDP");
				case 2 -> System.out.println("Voted successfully! You have voted to JSP");
				case 3 -> System.out.println("Voted successfully! You have voted to YCP");
				case 4 -> System.out.println("Voted successfully! You have voted to BJP");
				default -> System.out.println("Voted successfully! You have voted to Nota");
				}
				
			}else {
				System.out.println("Sorry, you are not eligible. Gender mismatched.");
			}
		}else {
			System.out.println("Not Eligible because of your age");
		}
	}

}
