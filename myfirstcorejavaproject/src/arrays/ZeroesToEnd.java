package arrays;

import java.util.Scanner;

public class ZeroesToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

//		int index=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=0) {
//				arr[index]=arr[i];
//				index++;
//			}
//		}
//		
//		for(int i=index;i<n;i++) {
//			arr[i]=0;
//		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
