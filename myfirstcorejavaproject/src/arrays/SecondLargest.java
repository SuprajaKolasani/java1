package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr= {5,6,3,4,9,1};
		
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Largest: "+largest);
		System.out.println("Second Largest: "+secondLargest);

	}

}
