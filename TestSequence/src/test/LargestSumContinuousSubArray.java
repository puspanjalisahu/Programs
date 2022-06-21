package test;

public class LargestSumContinuousSubArray {

	public static void main(String[] args) {
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("Maximum contiguous sum is " +
	                                       maxSubArraySum(a));

	}

	private static int maxSubArraySum(int[] a) {
		int sum = 0;
		int currentSum = a[0];
		
		for(int i=1;i<a.length;i++) {
			currentSum+=a[i];
			if(sum<currentSum) {
				sum = currentSum;
			}
			if(currentSum<0) {
				currentSum =0;
			}
		}
		return sum;
	}

}
