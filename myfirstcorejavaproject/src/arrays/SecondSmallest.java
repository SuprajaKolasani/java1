package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = { 44, 8, 57, 4, 36 };

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}

			if (arr[i] > smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest: " + smallest);
		System.out.println("Second smallest: " + secondSmallest);

	}

}
