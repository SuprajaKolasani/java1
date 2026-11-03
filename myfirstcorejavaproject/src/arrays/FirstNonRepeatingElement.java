package arrays;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3, 5 };
		boolean[] repeated = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if(repeated[i])
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					repeated[j] = true;
				}
			}
			if (count == 0) {
				System.out.println(arr[i]);
				break;
			}
		}

		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				break;
			}
		}

	}

}
