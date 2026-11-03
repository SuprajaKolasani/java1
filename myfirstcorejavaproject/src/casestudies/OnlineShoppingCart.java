package casestudies;

import java.util.Scanner;

public class OnlineShoppingCart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of products:");
		int n = sc.nextInt();

		System.out.println("Enter the prices of your products: ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		int totalBill = 0;

		for (int i = 0; i < n; i++) {
			totalBill += arr[i];

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Total Bill:" + totalBill);
		System.out.println("Highest Price: " + max);
		System.out.println("Lowest Price: " + min);

		System.out.println("Prices greater than 500: ");
		for (int i = 0; i < n; i++) {
			if (arr[i] > 500) {
				System.out.println(arr[i]);
			}
		}

	}
}
