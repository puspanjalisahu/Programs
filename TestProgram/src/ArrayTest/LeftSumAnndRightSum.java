package ArrayTest;

public class LeftSumAnndRightSum {

	public static void main(String[] args) {
		int arr[] = {6, 5, 1, 2, 3}; 
	    System.out.println(findPivot(arr)); 

	}

	private static int findPivot(int[] arr) {
		
		int l = 0;
		int r = arr.length-1;
		int lsum = arr[l];
		int rsum = arr[r];
		
		while(l<r) {
			if(lsum == rsum && l+2==r) {
				return l+1;
			}else if(lsum <rsum) {
				lsum +=arr[++l];
			}else {
				rsum+=arr[--r];
			}
		}
		
		return -1;
	}

}
