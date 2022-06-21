package test01;



class Node{
	
	int data ;
	
	Node next;
}
public class Sorting {

	
	
	public static void main(String[] args) {
	
		int arr[] = {1,5,9,2};
		
		int m = arr.length/2;
		int arr1[] = new int[m];
		
		for(int i=0;i<n/2;i++)
		int arr2[] = new int[m];
		
		for(int i=l-1;i<n/2;i--)
		sort(arr);
		
		
		
		

	}

	private static void sort(int[] arr) {
		
		int l = arr.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k =0;k<l;k++) {
			System.out.println("adata   "+arr[k]);
		}
	}

	 private static sort(int[] arr1,int[] arr2) {
		 
		 int m = arr1.length;
		 int n= arr2.length;
		 int i ,j,k=0;
		 int[] arr3 = new int[m+n];
		 while(i<m && j<n) {
			 if(arr1[i] < arr2[j]) {
				 arr3[k++] = arr1[i];
				 i++;
			 }else {
				 arr3[k++] = arr2[j];
				 j++;
			 }
		 }
		 
		 while(i<m) {
			 arr3[k++] = arr1[i];
		 }
		 while(j<n) {
			 arr3[k++] = arr2[j];
		 }
	 }
	 
}
