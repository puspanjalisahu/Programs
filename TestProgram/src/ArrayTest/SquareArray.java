package ArrayTest;

public class SquareArray {

	public static void main(String[] args) {
		 int arr[] = { -6, -3, -1, 2, 4, 5 };
		    int n = arr.length;
		 
		    System.out.println("Before sort ");
		    for(int i = 0; i < n; i++)
		        System.out.print(arr[i] + " ");
		 
		    sortSquares(arr,n);
		    System.out.println("");
		    System.out.println("After Sort ");
		    for(int i = 0; i < n; i++)
		        System.out.print(arr[i] + " ");

	}


	private static void sortSquares(int[] arr,int len) {
		int[] result = new int[len];
		int left =0;
		int right = len-1;
		
		
		for(int i=len-1;i>=0;i--) {
			if(Math.abs(arr[left])> arr[right]) {
				result[i]=arr[left]*arr[left];
				left++;
			}else {
				result[i]=arr[right]*arr[right];
				right--;
			}
		}
		for(int i=0;i<len;i++) {
			arr[i]=result[i];
		}
	}

}
