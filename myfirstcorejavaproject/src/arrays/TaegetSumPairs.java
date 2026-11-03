package arrays;

public class TaegetSumPairs {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,5};
		boolean[] visited=new boolean[arr.length];
		
		int target=6;
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i])
					continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.print("("+ arr[i]+","+arr[j]+")"+" ");
					visited[j]=true;
				}
			}
		}

	}
     
}
