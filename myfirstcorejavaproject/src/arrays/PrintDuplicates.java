package arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 1, 1, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(arr[i] + " ");

				boolean flag = false;
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						flag = true;
						break;
					}
				}
				if (count>0 && !flag) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
