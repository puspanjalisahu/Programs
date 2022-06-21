package ArrayTest;

public class MaxSumSubArrayOfSizeK {

	public static void main(String[] args) {
		System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
		    System.out.println("Maximum sum of a subarray of size K: "
		        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));

	}

	private static int findMaxSumSubArray(int k, int[] arr) {
		int windowSum;int maxSum=0;
		
		for(int i=0;i<arr.length-k;i++) {
			windowSum = 0;
		  for(int j=i;j<i+k;j++) {
			  windowSum = windowSum+arr[j];
		  }
		  maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

}
