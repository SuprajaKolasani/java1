package arrays;

import java.util.Scanner;

public class Practices {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter size of the array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] arr2= new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=arr[i];
		}
		
		System.out.print("New array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
//		int flag=0;
//		for(int i=0;i<n-1;i++) {
//			if(arr[i]>arr[i+1]) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==0) {
//			System.out.println("Sorted!!");
//		}
//		else {
//			System.out.println("Not sorted..!!");
//		}
	}

}
