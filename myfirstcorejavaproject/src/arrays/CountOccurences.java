package arrays;

import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();   
		}
		boolean[] counted=new boolean[arr.length];
	
		for(int i=0;i<n;i++) {
			int count=0;
			if(counted[i])
					continue;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					counted[j]=true;
				}
			}
			System.out.println(arr[i]+" "+count);
		}

	}

}
