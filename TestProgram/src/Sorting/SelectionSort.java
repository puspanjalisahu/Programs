package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		 int arr[] = { 12, 11, 13, 5, 6 };
		 
	       
	        sort(arr);
	 
	        printArray(arr);

	}

	private static void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			
			int selInd = i;
			
			for(int j=i+1;j<n;j++) 
				if(arr[j]<arr[selInd])
					selInd =j;
			
			
				int temp = arr[selInd];
				arr[selInd] = arr[i];
				arr[i]= temp;
			
		}
		
	}

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}
