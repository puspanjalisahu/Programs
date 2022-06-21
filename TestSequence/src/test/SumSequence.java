package test;

public class SumSequence {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,7,8,9,24,12,12};
		int sum = 24;
		
		findSubArray(arr,sum);
	}

	private static void findSubArray(int[] arr, int sum) {
		
		
		if(arr == null || arr.length <1 || sum==0) {
			
			System.out.println("not found");
		}
		
		int currentSum = arr[0];
		int start = 0;
		int n = arr.length;
		boolean found = false;
		
		for(int i =1;i<n;i++) {
			
			if(currentSum > sum && start <i ) {
				currentSum= currentSum-arr[start];
				start++;
				i--;
			}else {
				currentSum = currentSum+arr[i];
			}
			if(currentSum == sum) {
				found = true;
				System.out.println(" the sequence from start"+start+" lastseq "+i);
				
			}
			
		}
		
		if(!found)
		System.out.println("not found");
		
	}

}
