package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] c= new int[5];
		System.out.println("1st array elements: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("2nd array elements: ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
//		int[] c=new int[arr1.length+arr2.length];
		
//		for(int i=0;i<arr1.length;i++) {
//			c[i]=arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			c[arr1.length+i]=arr2[i];
//		}
		
		for(int i=0;i<arr1.length;i++) {
			c[i]=arr1[i]+arr2[i];
		}
		
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
//		System.out.println(Arrays.toString(c));
	}
}
