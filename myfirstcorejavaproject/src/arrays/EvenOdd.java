package arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
//		int evenCount=0;
//		int oddCount=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2 ==0) {
//				evenCount++;
//			}
//			else {
//				oddCount++;
//			}
//		}
//		System.out.println("Even count: "+evenCount);
//		System.out.println("Odd count: "+oddCount);
		
//		System.out.print("Reversed array: ");
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}

		int positive=0;
		int negative=0;
		int zeroes=0;
		for(int a: arr) {
			if(a >0) {
				positive++;
			}
			else if(a<0) {
				negative++;
			}
			else {
				zeroes++;
			}
		}
		System.out.println("Positives: "+positive);
		System.out.println("Negatives: "+negative);
		System.out.println("Zeroes: "+zeroes);
	}

}
