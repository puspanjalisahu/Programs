package test;
import java.util.ArrayList;
import java.util.List;

public class TestSequence {

	public static void main(String[] args) {
	
		int arr[] = { 5, 16, 17, 3, 4, 5, 6, 9, 12, 4, 5, 7,9,10,67,99,100,109,1};

		 findSequence(arr);

	}

	private static void findSequence(int[] arr) {
		if(arr == null || arr.length ==0) {
			System.out.println("no sequence");
		}
		if(arr.length ==1) {
			System.out.println("sequence"+arr[0]);
		}
		List<Integer> list = new ArrayList<>();
		List<Integer> longestSequence = new ArrayList<>() ;
		int longest = 0;
		list.add(arr[0]);
		for(int i = 1;i<arr.length;i++) {
		   
			if(arr[i-1] <arr[i]) {
				list.add(arr[i]);
			}else {
				if(list.size() >longest) {
					longest = list.size();
					longestSequence.clear();
					longestSequence.addAll(list);
				}
				list.clear();
				list.add(arr[i]);
			}
			
			
		}
		
		if(!list.isEmpty() && list.size()>longest) {
			longestSequence.addAll(list);
		}
		
		if(longest !=0 && longestSequence!=null && !longestSequence.isEmpty()) {
			longestSequence.forEach(e-> System.out.println(e));
		}
	}

}
